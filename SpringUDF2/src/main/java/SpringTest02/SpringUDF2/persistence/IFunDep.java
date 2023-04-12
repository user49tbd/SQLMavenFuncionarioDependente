package SpringTest02.SpringUDF2.persistence;

import java.sql.SQLException;
import java.util.List;

import SpringTest02.SpringUDF2.model.FuncionarioDependente;

public interface IFunDep {
	public List<FuncionarioDependente> listfd() throws SQLException, ClassNotFoundException;
	public double getValTot(int fd) throws SQLException, ClassNotFoundException;
}
