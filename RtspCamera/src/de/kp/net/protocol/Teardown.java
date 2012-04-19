package de.kp.net.protocol;

public class Teardown extends RtspResponse {

    public Teardown(int cseq) {
        super(cseq);
    }

    protected void generar(){
        response += getHeader();
        response += getBody() + CRLF;
    }
    
    protected void generateBody() {
        body += "";
    }

}
