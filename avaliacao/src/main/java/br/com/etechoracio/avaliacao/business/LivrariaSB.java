package br.com.etechoracio.avaliacao.business;

import br.com.etechoracio.avaliacao.dao.LivrariaDAO;
import br.com.etechoracio.common.business.BaseSB;

public class LivrariaSB extends BaseSB {
	
	private LivrariaDAO livraria;
	

	@Override
	protected void postConstructImpl() {
		// TODO Auto-generated method stub
		
		livraria = getDAO(LivrariaDAO.class);
		
	}
	
	public void save() {
		
	}

}
