public class PedidoEstadoPago extends PedidoEstado{
    private PedidoEstadoPago(){};
    private static PedidoEstadoPago instance = new PedidoEstadoPago();
    public static PedidoEstadoPago getInstance(){
        return instance;
    }

    public String getEstado() {
        return "Pago";
    }

    public boolean enviado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        return true;
    }

     public boolean cancelado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
