public abstract class PedidoEstado {

    public abstract String getEstado();

    public boolean novo(Pedido pedido) {
        return false;
    }

    public boolean pago(Pedido pedido) {
        return false;
    }

    public boolean enviado(Pedido pedido) {
        return false;
    }

    public boolean cancelado(Pedido pedido) {
        return false;
    }
}
