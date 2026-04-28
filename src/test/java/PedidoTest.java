import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }

    //Pedido Novo
    @Test
    public void naoDeveRenovarNovoPedido() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertFalse(pedido.novo());
    }

    @Test
    public void devePagarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.pago());
        assertEquals(PedidoEstadoPago.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoNovo() {
        pedido.setEstado(PedidoEstadoNovo.getInstance());
        assertTrue(pedido.cancelado());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    //Pedido Pago
    @Test
    public void deveEnviarPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertTrue(pedido.enviado());
        assertEquals(PedidoEstadoEnviado.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveCancelarPedidoPago() {
        pedido.setEstado(PedidoEstadoPago.getInstance());
        assertTrue(pedido.cancelado());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

     //Pedido Enviado
    @Test
    public void deveCancelarPedidoEnviado() {
        pedido.setEstado(PedidoEstadoEnviado.getInstance());
        assertTrue(pedido.cancelado());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

}
