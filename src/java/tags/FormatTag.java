/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tags;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 *
 * @author mesa
 */
public class FormatTag extends SimpleTagSupport{
    
    private String colour;
    public int font_size;
    public boolean is_uppercase;

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getFont_size() {
        return font_size;
    }

    public void setFont_size(int font_size) {
        this.font_size = font_size;
    }

    public boolean isIs_uppercase() {
        return is_uppercase;
    }

    
    public void setIs_uppercase(boolean is_uppercase) {
        this.is_uppercase = is_uppercase;
    }

    @Override
    public void doTag() throws JspException, IOException {
        
        PageContext pageContext = (PageContext) getJspContext();
        JspWriter out = pageContext.getOut();
        
        String style = "";
        
        if(is_uppercase){
            style = "style=\"text-transform: uppercase; font-size:" 
            + font_size  + "px; color: " + colour + ";\"";
        }else{
             style = "style=\"font-size:"+font_size + "px; color:" + colour + ";\"";
        }
        try{
            out.print("<p " + style + ">");
            getJspBody().invoke(out);
            out.print("</p>");
        }catch(IOException | JspException e){
            
        }
        
    }
        
    
    
}
