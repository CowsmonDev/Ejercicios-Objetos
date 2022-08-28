package serie;

public class Episodio {
        private final String titulo;
        private final String descripcion;
        private float calificacion;

        public Episodio(String titulo, String descripcion, float calificacion) {
                this.titulo = titulo;
                this.descripcion = descripcion;
                this.calificacion = calificacion;
        }

        public Episodio(String titulo, String descripcion) { this(titulo, descripcion, -1); }

        public boolean setCalificacion(float calificacion) {
                if((calificacion > 0) && (calificacion < 6)){
                        this.calificacion = calificacion;
                        return true;
                }
                System.out.println("La calificacion debe estar entre 1 y 5");
                return false;
        }

        public String getTitulo() { return titulo; }
        public String getDescripcion() { return descripcion; }
        public boolean isVista() { return (calificacion != -1); }
        public float getCalificacion() { return calificacion; }
}
