package IcoExample;

import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.api.lexer.Language;

@LanguageRegistration(mimeType = testLanguage.MIME_TYPE)
public class testLanguage extends DefaultLanguageConfig {

    public static final String MIME_TYPE = "text/x-test";

    @Override
    public Language getLexerLanguage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getDisplayName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}