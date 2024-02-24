import java.util.ArrayList;
import java.util.HashMap;

public class TiendaDeCafe {
    private String nombre = "Café Global EAN";
    private String direccion = "Avenida caracas, Bogotá, Colombia";
    private String telefono = "+57 3232096190";
    private ArrayList<Producto> productos;
    private HashMap<String, Empleado> empleados;

    public TiendaDeCafe() {
        this.productos = new ArrayList<>();
        this.empleados = new HashMap<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void registrarEmpleado(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);
    }
}
