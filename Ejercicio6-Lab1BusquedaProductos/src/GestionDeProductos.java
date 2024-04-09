
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author El Notaloko-PC 2.0
 */
public class GestionDeProductos extends javax.swing.JInternalFrame {

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
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtxtStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                        .addComponent(jtxtPrecio, javax.swing.GroupLayout.Alignment.LEADING))
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
        
        int codigo;
        double precio;
        int stock ;

        try{
            codigo = Integer.parseInt(jtxtCodigo.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ingrese un numero entero");
            jtxtCodigo.setText("");
            jtxtCodigo.requestFocus();
            return;
        }

        String descripcion = jtxtDescripcion.getText().toLowerCase();

        try{
            precio =Double.parseDouble(jtxtPrecio.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "El precio tiene que ser un numero");
            jtxtPrecio.setText("");
            jtxtPrecio.requestFocus();
            return;
        }

        try{
            stock = Integer.parseInt(jtxtStock.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "El stock tiene que ser un numero");
            jtxtStock.setText("");
            jtxtStock.requestFocus();
            return;
        }

        String categoria =(String) jcCategorias.getSelectedItem();

        Producto p = new Producto(codigo, descripcion,precio, stock, categoria);

        Menu.getProductos().add(p);
        
        JOptionPane.showMessageDialog(this, "Producto Guardado");

        //Una vez agregado el producto limpia todos los campos
        limpiarCampos();

    }//GEN-LAST:event_jbtnGuardarProductoActionPerformed
    
    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        // Limpia los campos
        limpiarCampos();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // Busca por codigo el producto si es que este se encuentra       
        boolean aux = false;
        for(Producto p : Menu.getProductos()){
            if(p.getCodigo() == Integer.parseInt(jtxtCodigo.getText())){
                jtxtDescripcion.setText(p.getDescripcion());
                jtxtPrecio.setText("" + p.getPrecio());
                jtxtStock.setText("" + p.getStock());
                jcCategorias.setSelectedItem(p.getCategorias());
                aux = true;
                return;
            }
        }        
        if(aux == false){
            JOptionPane.showMessageDialog(this, "El producto no se encuentra en la lista");
        }   
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSalirActionPerformed
        // Salimos de la pestaña, la cerramos
        dispose();
    }//GEN-LAST:event_jbtnSalirActionPerformed

    private void jbtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarProductoActionPerformed
        // Eliminamos el producto seleccionado
        
        // Buscar el producto en la lista
    for (Producto p : Menu.getProductos()) {
        if (p.getCodigo() == Integer.parseInt(jtxtCodigo.getText())) {
            // Remover el producto de la lista
            Menu.getProductos().remove(p);
            JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
            // Limpiar los campos después de eliminar el producto
            limpiarCampos();
            return; // Terminar el método después de eliminar el producto
        }
    }
    
        //Si no lo encontro disparamos otro JOptionPane
        JOptionPane.showMessageDialog(this,"El producto no se encuentra agragado a la lista");
        
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
