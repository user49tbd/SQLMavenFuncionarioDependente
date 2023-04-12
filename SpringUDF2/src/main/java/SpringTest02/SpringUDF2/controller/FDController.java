package SpringTest02.SpringUDF2.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SpringTest02.SpringUDF2.model.FuncionarioDependente;
import SpringTest02.SpringUDF2.persistence.FunDep;

@Controller
public class FDController {
	
	@Autowired
	FunDep fdep;
	
	@RequestMapping(name = "FD", value = "/FD", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {
		return new ModelAndView("FD");
	}
	
	
	@RequestMapping(name = "FD", value="/FD", method = RequestMethod.POST)
	public ModelAndView init(ModelMap model, @RequestParam Map<String,String>
	allParam) {
		String btn1 = allParam.get("btn1");
		String btnVal = allParam.get("btnVal");
		String btnID = allParam.get("btnID");
		
		double val=0;
		List<FuncionarioDependente> lfd = new ArrayList<>();
		
		FunDep fun = new FunDep();
		
		try {
			if(btn1!=null) {
				if (btn1.equals("Listar")) {
					lfd = fdep.listfd();
				}
			}
			else {
			//if(btnVal.equals("Buscar Valor") && !btnID.equals("")) {
				System.out.println("exeking");
				FuncionarioDependente fd = new FuncionarioDependente();
				fd.setCodigo(1);
				val= fdep.getValTot(Integer.parseInt(btnID));
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			model.addAttribute("lis",lfd);
			model.addAttribute("valu",val);
			System.out.println(val);
		}
		
		return new ModelAndView("FD");
		
	}
}
