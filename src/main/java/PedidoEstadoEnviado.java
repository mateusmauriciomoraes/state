public class PedidoEstadoEnviado extends PedidoEstado{
    private PedidoEstadoEnviado(){};
    private static PedidoEstadoEnviado instance = new PedidoEstadoEnviado();
    public static PedidoEstadoEnviado getInstance(){
        return instance;
    }

    public String getEstado() {
        return "Enviado";
    }

     public boolean cancelado(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }
}
