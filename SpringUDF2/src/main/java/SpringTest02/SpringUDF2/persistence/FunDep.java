package SpringTest02.SpringUDF2.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringTest02.SpringUDF2.model.FuncionarioDependente;

@Repository
public class FunDep implements IFunDep{
	
	@Autowired
	GenericDao gd;

	@Override
	public List<FuncionarioDependente> listfd() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection c;
		c = gd.getC();
		List lt = new ArrayList();
		String sql = "SELECT NF,ND,SF,SD FROM FN_TABBER()";
		PreparedStatement ps = c.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			FuncionarioDependente fd = new FuncionarioDependente();
			fd.setDependenteNome(rs.getString("ND"));
			fd.setFuncionarioNome(rs.getString("NF"));
			fd.setDependenteSal(rs.getDouble("SD"));
			fd.setFuncionarioSal(rs.getDouble("SF"));
			lt.add(fd);
		}
		rs.close();
		ps.close();
		c.close();
		return lt;
	}

	@Override
	public double getValTot(int fd) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		double val =0;
		Connection c;
		c = gd.getC();
		String sql = "SELECT dbo.SCAR(?) AS FUNC";
		PreparedStatement ps = c.prepareStatement(sql);
		ps.setDouble(1,fd);
		ResultSet rs = ps.executeQuery();
		System.out.println("ok");
		if(rs.next()) {
			val = rs.getDouble("FUNC");
			System.out.println("number = "+val);
		}
		ps.execute();
		ps.close();
		c.close();
		return val;
	}

}
