package br.upe.ppsw.jabberpoint.controller;

import java.io.IOException;

import br.upe.ppsw.jabberpoint.model.Accessor;
import br.upe.ppsw.jabberpoint.model.Presentation;
import br.upe.ppsw.jabberpoint.model.XMLAccessor;
import br.upe.ppsw.jabberpoint.view.SlideViewerFrame;

public class PresentationController {
	//criando um controlador para a apresentação
	//separando responsabilidades
	
	 protected static final String JABVERSION = "Jabberpoint 1.6 -";
	
	public Presentation load(String...args) throws IOException {
		
		Presentation presentation = new Presentation();
		
		new SlideViewerFrame(JABVERSION, presentation);	
		
		if (args.length == 0) {
			Accessor.getDemoAccessor().loadFile(presentation, "");
		} else {
			new XMLAccessor().loadFile(presentation, args[0]);
		}
		
		presentation.setSlideNumber(0);
		
		return presentation;
	}
	    
	  
}

