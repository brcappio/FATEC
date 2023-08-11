public class Lampada3Estados {
	private int estado;
	
	public Lampada3Estados (int estado){
		this.estado = estado;
	}
	
	public void setEstado(int estado) {
        switch (estado) {
            case 1:
                this.estado = 1;
                break;
            case 2:
                this.estado = 2;
                break;
            case 3:
                this.estado = 3;
                break;
            default:
                System.out.println("Estado Invalido!!");
        }
    }

    public String getEstado() {
        switch (estado) {
            case 1:
                return "Ligada";
            case 2:
                return "Meia Luz";
            case 3:
                return "Desligada";
            default:
                return "Estado Invalido!!";
        }
    }
	
}

