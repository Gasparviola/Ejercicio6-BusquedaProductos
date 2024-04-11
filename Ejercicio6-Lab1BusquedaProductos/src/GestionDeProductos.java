
import Producto.Producto;
import javax.swing.JOptionPane;


/**
 *
 * @author El Notaloko-PC 2.0
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {
private Producto productoenco=null;
    /**
     * Creates new form GestionDeProductos
     */
    public GestionDeProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtDescripcion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtStock = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbtnGuardarProducto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbtnSalir = new javax.swing.JButton();
        jbtnBuscar = new javax.swing.JButton();
        jbtnEliminarProducto = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jLabel3.setText("Descripción");

        jLabel4.setText("Precio");

        jLabel5.setText("Stock");

        jLabel6.setText("Categoría");

        jcCategorias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza", "Comestible", "Perfumeria" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel1.setText("Gestion de Productos");

        jbtnGuardarProducto.setText("Guardar");
        jbtnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarProductoActionPerformed(evt);
            }
        });

        jLabel2.setText("Codigo");

        jbtnSalir.setText("Salir");
        jbtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSalirActionPerformed(evt);
            }
        });

        jbtnBuscar.setText("Buscar");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jbtnEliminarProducto.setText("Eliminar");
        jbtnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarProductoActionPerformed(evt);
            }
        });

        jbtnNuevo.setText("Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(jbtnGuardarProducto)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtStock)
                                    .addComponent(jtxtPrecio)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtxtCodigo)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbtnBuscar)
                                        .addGap(26, 26, 26))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jbtnEliminarProducto)))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtnSalir)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnGuardarProducto)
                    .addComponent(jbtnSalir)
                    .addComponent(jbtnEliminarProducto)
                    .addComponent(jbtnNuevo))
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarProductoActionPerformed

        //Agrega un nuevo producto a la lista
        
        try{
            int codigo=Integer.parseInt(jtxtCodigo.getText());
            String descripcion=jtxtDescripcion.getText();
            double precio=Double.parseDouble(jtxtPrecio.getText());
            String rubro=(String)jcCategorias.getSelectedItem();
            int stock=Integer.parseInt(jtxtStock.getText());
            Producto producto=new Producto(codigo,descripcion,precio,stock,rubro);
            Menu.lista.add(producto);
            JOptionPane.showMessageDialog(this, "Se ha guardado correctamente.");
            limpiarCampos();
        }catch(NumberFormatException fe){
            JOptionPane.showMessageDialog(this, "Verifique haber ingresado numeros.");
        }

    }//GEN-LAST:event_jbtnGuardarProductoActionPerformed
    
    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // Limpia los campos
        limpiarCampos();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // Busca por codigo el producto si es que este se encuentra       
        int codigo=Integer.parseInt(jtxtCodigo.getText());
        for(Producto it:Menu.lista){
            if(it.getCodigo()==codigo){
                productoenco=it;
            }
        }
        if(productoenco!=null){
            jtxtDescripcion.setText(productoenco.getDescripcion());
            jtxtPrecio.setText(productoenco.getPrecio()+"");
            jtxtStock.setText(productoenco.getStock()+"");
            jcCategorias.setSelectedItem(productoenco.getRubro());
        }else{
            JOptionPane.showMessageDialog(this, "Producto no encontrado.");
            productoenco=null;
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // Salimos de la pestaña, la cerramos
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarProductoActionPerformed
        if(productoenco!=null){
            boolean resultado=Menu.lista.remove(productoenco);
            if(resultado=true){
                JOptionPane.showMessageDialog(this, "Producto borrado.");
                limpiarCampos();
            }else{
                JOptionPane.showMessageDialog(this, "No se encontro.");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay producto para borrar.");
        }
        
    }//GEN-LAST:event_jbtnEliminarProductoActionPerformed

    private void limpiarCampos() {
        jtxtCodigo.setText("");
        jtxtDescripcion.setText("");
        jtxtPrecio.setText("");
        jtxtStock.setText("");
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnEliminarProducto;
    private javax.swing.JButton jbtnGuardarProducto;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JButton jbtnSalir;
    private javax.swing.JComboBox<String> jcCategorias;
    private javax.swing.JTextField jtxtCodigo;
    private javax.swing.JTextField jtxtDescripcion;
    private javax.swing.JTextField jtxtPrecio;
    private javax.swing.JTextField jtxtStock;
    // End of variables declaration//GEN-END:variables
}
