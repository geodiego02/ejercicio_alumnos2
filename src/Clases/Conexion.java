package Clases;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    private Connection c;
    private Statement st;
    private ResultSet rs;
    
    public Conexion(){
        try{
            String url = "jdbc:mysql://localhost/unidad4";
            String usuario = "root";
            String clave = "";
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(url,usuario,clave);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL en la conexión: " + e.getMessage(),"Error en la Conexión",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico en la conexión: " + e.getMessage(),"Error en la Conexión",0);
            System.exit(0);
        }
    }
    
    public boolean validarUsuario(String usuario, String clave){
        boolean existe = false;
        try{
            String sql = "select * from usuario where nom_usu = '"+usuario+"' and cla_usu = '"+clave+"'; ";
            st = c.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                existe = true;
            }else{
                JOptionPane.showMessageDialog(null,"Usuario inválido, vuelva a ingresar los datos.","Validación",1);
            }
            st.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
        return existe;
    }
    
    public DefaultComboBoxModel construirCbo(String tabla, String campo){
        DefaultComboBoxModel borrador = new DefaultComboBoxModel();
        try{
            String sql = "select * from "+tabla+";";
            st = c.createStatement();
            rs = st.executeQuery(sql);
            borrador.addElement("Seleccione");
            while(rs.next()){
                borrador.addElement(rs.getString(campo));
            }
            st.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
        return borrador;
    }
    
    public void guardarAlumnos(Alumno alu){
        try{
            String sql = "insert into alumno values('"+alu.getRut()+"','"+alu.getNombre()+"','"+alu.getApellido()+"','"+alu.getSexo()+"','"+alu.getCiudad()+"','"+alu.getCarrera()+"');";
            st = c.createStatement();
            st.execute(sql);
            st.close();
            JOptionPane.showMessageDialog(null,"Alumno guardado existosamente.","Guardar",1);
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
    }
    
    public DefaultTableModel construirTablaMostrar(){
        DefaultTableModel borrador = new DefaultTableModel();
        try{
            
            String titulos[] = {"Rut","Nombre","Apellido","Sexo","Ciudad","Carrera"};
            borrador.setColumnIdentifiers(titulos);
            
            String contenido[] = new String[6];
            String sql = "select rut_alu,nom_alu,ape_alu,sex_alu,nom_ciu,car_alu from alumno,ciudad where alumno.ciu_alu = ciudad.id_ciu;";
            st = c.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                contenido[0] = rs.getString("rut_alu");
                contenido[1] = rs.getString("nom_alu");
                contenido[2] = rs.getString("ape_alu");
                contenido[3] = rs.getString("sex_alu");
                contenido[4] = rs.getString("nom_ciu");
                contenido[5] = rs.getString("car_alu");
                borrador.addRow(contenido);
            }
            st.close();
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
        return borrador;
    }
    
    public boolean consultarAlumno(String rut){
        boolean consultar = false;
        try{
            String consulta_sql = "select * from alumno where rut_alu = '"+rut+"';";
            st = c.createStatement();
            rs = st.executeQuery(consulta_sql);
            if(rs.next()){
                consultar = true;
            }    
            rs.close();
            st.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
        return consultar;
    }
    
    public void eliminarAlumno(String rut){
        try{
            String consulta_sql = "delete from alumno where rut_alu = '"+rut+"';";
            st = c.createStatement();
            st.execute(consulta_sql);
            st.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
    }
    
    public Alumno obtenerAlumno(String rut){
        Alumno alu = new Alumno();
        try{
            String sql = "select * from alumno where rut_alu = '"+rut+"';";
            st = c.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()){
                alu.setNombre(rs.getString("nom_alu"));
                alu.setApellido(rs.getString("ape_alu"));
                alu.setSexo(rs.getString("sex_alu"));
                alu.setCiudad(rs.getInt("ciu_alu"));
                alu.setCarrera(rs.getString("car_alu"));
                alu.setRut(rs.getString("rut_alu"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
        return alu;
    }
    
    public void modificarAlumno(Alumno a){
        try{
            String sql_update = "update alumno set nom_alu = '"+a.getNombre()+"', ape_alu = '"+a.getApellido()+"', sex_alu = '"+a.getSexo()+"', ciu_alu = '"+a.getCiudad()+"', car_alu = '"+a.getCarrera()+"' where rut_alu = '"+a.getRut()+"';";
            st = c.createStatement();
            st.execute(sql_update);
            st.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error SQL: " + e.getMessage(),"Error",0);
            System.exit(0);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error Genérico: " + e.getMessage(),"Error",0);
            System.exit(0);
        }
    }
}













