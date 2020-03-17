package com.pe.comercial.dao.sp.usuario;

// 
//import java.util.List;
//import java.util.Map;
//
//import javax.sql.DataSource;
//
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.core.SqlReturnResultSet;
//import org.springframework.jdbc.object.StoredProcedure;
//
//import com.pe.comercial.bean.Usuario;
//
//public class UsuarioSP extends StoredProcedure {	
//		
//	public UsuarioSP(DataSource ds) { 
//		   super(ds, "SP_LISTAR_USUARIOS"); 
//	
//		declareParameter(new SqlReturnResultSet("LISTA_USUARIOS", (RowMapper<Usuario>) (arg0, arg1) ->  {
//	    
//			Usuario usuario = new Usuario();
//			usuario.setCodigousuario(arg0.getString("codigousuario"));
//			usuario.setNombre(arg0.getString("nombre"));
//				 
//			return usuario;
//		}));
//		compile();
//	}
//	    public List<Usuario> executeProcedure() {  
//	        Map<String, Object> out = execute();
//	        return (List<Usuario>) out.get("LISTA_USUARIOS");
//	    }	
//}
