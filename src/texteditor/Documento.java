package texteditor;

import java.io.Serializable;
import javax.swing.JTextPane;
import javax.swing.text.Style;
import javax.swing.text.StyledDocument;

public class Documento implements Serializable{
    private JTextPane panel;
    private StyledDocument doc;
    private Style estilo;

    public Documento(JTextPane panel, StyledDocument doc, Style estilo) {
        this.panel = panel;
        this.doc = doc;
        this.estilo = estilo;
    }

    public JTextPane getPanel() {
        return panel;
    }

    public void setPanel(JTextPane panel) {
        this.panel = panel;
    }

    public StyledDocument getDoc() {
        return doc;
    }

    public void setDoc(StyledDocument doc) {
        this.doc = doc;
    }

    public Style getEstilo() {
        return estilo;
    }

    public void setEstilo(Style estilo) {
        this.estilo = estilo;
    }

    @Override
    public String toString() {
        return "Documento{" + "panel=" + panel + ", doc=" + doc + ", estilo=" + estilo + '}';
    }
    
    
    
}
