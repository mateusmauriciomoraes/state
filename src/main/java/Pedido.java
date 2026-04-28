public class Pedido {
    private int numero;
    private PedidoEstado estado;

    public Pedido(){
        this.estado = PedidoEstadoNovo.getInstance();
    }

    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }

    public boolean novo() {
        return estado.novo(this);
    }

    public boolean pago() {
        return estado.pago(this);
    }

    public boolean enviado() {
        return estado.enviado(this);
    }

    public boolean cancelado() {
        return estado.cancelado(this);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public PedidoEstado getEstado() {
        return estado;
    }
}
