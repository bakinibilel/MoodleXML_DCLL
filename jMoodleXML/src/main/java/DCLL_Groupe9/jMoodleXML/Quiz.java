package DCLL_Groupe9.jMoodleXML;
import org.jdom.*;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Attribute;
import org.jdom.Element;

public class Quiz {
	 public List<Reponse> answers;
	 
	 public String nomQ;
	 
	 public String textQ;
	 
	 public String typeQ;
	 
	// Nous allons commencer notre arborescence en creant la racine XML
	 
	 // qui sera ici "question"
	 
	  public static Element question;
	  
	  public Quiz(String nomQ, String textQ, String type) {
	 
	   question = new Element("question");  
	 
	  answers = new ArrayList<Reponse>();
	 
	   this.nomQ = nomQ;
	 
	   this.textQ = textQ;
	 
	   this.typeQ = type;
	     
	 
	   
	   Attribute questionAttribute = new Attribute("type", this.typeQ);
	     question.setAttribute(questionAttribute);
	 
	  Element nom = new Element("nom");
	 
	   Element textNomQ = new Element("text");
	 
	  textNomQ.setText(nomQ);
	 
	  nom.addContent(textNomQ);
	 
	  question.addContent(nom);
	   Element questiontext = new Element("questiontext");
	 
	 
	  Element text = new Element("text");
	          text.setText(textQ);
	 
	  questiontext.addContent(text);
	 
	  question.addContent(questiontext);
	 
	 }
	 public void addAnwser(Reponse e) {
	    answers.add(e);
	   }
	   
	 
	/* public static Element getQuestionElement() {
	 
	 return question;
	   }
	 }*/

	}