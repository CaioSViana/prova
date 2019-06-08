package br.com.etechoracio.avaliacao.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.avaliacao.business.LivrariaSB;
import br.com.etechoracio.avaliacao.model.Livraria;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class LivrariaMB extends BaseMB {

	@Autowired
	private LivrariaSB livrariaSB;
	
	
	private Livraria edit = new Livraria();
	
	public void onSave() {
	
	}
}
