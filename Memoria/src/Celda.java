public class Celda {

    private Byte elemento;
    private float TA;
    private boolean isWritten;
    public Celda(Byte elemento, float TA, boolean isWritten) {
        this.elemento = elemento;
        this.TA = TA;
        this.isWritten = isWritten;
    }

    public Celda(Byte elemento, float TA) {
        this(elemento, TA, false);
    }

    public void setElemento(Byte elemento, float TA) {
        isWritten = true;
        this.TA = TA;
        this.elemento = elemento;
    }
    public void setTA(float TA) { this.TA = TA; }
    public void setWritten(boolean written) { isWritten = written; }

    public Byte getElemento() { return elemento ; }
    public float getTA() { return TA; }
    public boolean isWritten() { return isWritten; }



}
