/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package libreria;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Base_Datos_Conexion.Conexion_ventana_consultas;
import codigo_ventana.clase_ventanaVolver_inicio;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex. Pattern;

public class ventana_consultas extends javax.swing.JFrame {

    public ventana_consultas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        addWindowListener(new clase_ventanaVolver_inicio());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg2 = new javax.swing.JPanel();
        panel_titulo2 = new javax.swing.JPanel();
        label_titulo2 = new javax.swing.JLabel();
        buscar_panel = new javax.swing.JPanel();
        buscar_boton = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        OpcionCombo = new javax.swing.JComboBox<>();
        caja_busquedas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaConsultas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg2.setBackground(new java.awt.Color(255, 255, 255));

        panel_titulo2.setBackground(new java.awt.Color(147, 146, 133));

        label_titulo2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 30)); // NOI18N
        label_titulo2.setForeground(new java.awt.Color(255, 255, 255));
        label_titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_titulo2.setText("VENTANA DE CONSULTAS\n");

        javax.swing.GroupLayout panel_titulo2Layout = new javax.swing.GroupLayout(panel_titulo2);
        panel_titulo2.setLayout(panel_titulo2Layout);
        panel_titulo2Layout.setHorizontalGroup(
            panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo2Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addComponent(label_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_titulo2Layout.setVerticalGroup(
            panel_titulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_titulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_titulo2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buscar_panel.setBackground(new java.awt.Color(184, 183, 169));

        buscar_boton.setFont(new java.awt.Font("Victor Mono SemiBold", 1, 14)); // NOI18N
        buscar_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buscar_boton.setText("BUSCAR");
        buscar_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_botonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscar_botonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout buscar_panelLayout = new javax.swing.GroupLayout(buscar_panel);
        buscar_panel.setLayout(buscar_panelLayout);
        buscar_panelLayout.setHorizontalGroup(
            buscar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        buscar_panelLayout.setVerticalGroup(
            buscar_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscar_boton, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );

        OpcionCombo.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 15)); // NOI18N
        OpcionCombo.setMaximumRowCount(3);
        OpcionCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libros", "Usuarios", "Prestamos", "Autores", "Editoriales" }));
        OpcionCombo.setBorder(null);
        OpcionCombo.setMinimumSize(new java.awt.Dimension(72, 30));
        OpcionCombo.setPreferredSize(new java.awt.Dimension(72, 30));
        OpcionCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcionComboActionPerformed(evt);
            }
        });

        caja_busquedas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 14)); // NOI18N
        caja_busquedas.setForeground(new java.awt.Color(153, 153, 153));
        caja_busquedas.setText("Ingrese su consulta aquí");
        caja_busquedas.setBorder(null);
        caja_busquedas.setPreferredSize(new java.awt.Dimension(188, 30));
        caja_busquedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                caja_busquedasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                caja_busquedasMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 16)); // NOI18N
        jLabel2.setText("Opciones:");

        jLabel3.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 16)); // NOI18N
        jLabel3.setText("Buscador: ");

        TablaConsultas.setFont(new java.awt.Font("Victor Mono SemiBold", 0, 13)); // NOI18N
        TablaConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TablaConsultas);

        javax.swing.GroupLayout bg2Layout = new javax.swing.GroupLayout(bg2);
        bg2.setLayout(bg2Layout);
        bg2Layout.setHorizontalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(buscar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(caja_busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(OpcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addComponent(panel_titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bg2Layout.setVerticalGroup(
            bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel_titulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(bg2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(caja_busquedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(OpcionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(buscar_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caja_busquedasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_busquedasMouseExited
        if(caja_busquedas.getText().equals("")){
            caja_busquedas.setText("Ingrese su consulta aquí");
            caja_busquedas.setForeground(new Color(155, 155, 155));
        }
    }//GEN-LAST:event_caja_busquedasMouseExited

    private void caja_busquedasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caja_busquedasMouseEntered
        if(caja_busquedas.getText().equals("Ingrese su consulta aquí")){
            caja_busquedas.setText("");
            caja_busquedas.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_caja_busquedasMouseEntered

    private void OpcionComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcionComboActionPerformed
        
        if(OpcionCombo.getSelectedIndex() == 0){
            // si LIbros es seleccionado
            
            limpiar_tabla();
            titulo = new String[]{"Id_libro", "Titulo", "Autor", "Editorial",  "Ejemplares"};
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                registros_que_coinciden = Conexion_ventana_consultas.ConsultaTodosLosLibros();
                
                
                List<String> m = (List<String>) registros_que_coinciden.get(0);
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {
                    
                    
                    
                    columnas = (List<String>) registros_que_coinciden.get(i);
                            
                    tabla.addRow(new Object[]{ columnas.get(0) , columnas.get(1), columnas.get(2), columnas.get(3),columnas.get(4)});


                }
                
                
                
                
            }
            
            
        }else if(OpcionCombo.getSelectedIndex() == 1){
            //si usuarios es seleccionado
            limpiar_tabla();
            titulo = new String[]{"Id Usuario", "Nombre", "Ap. Paterno", "Ap. Materno", "Direccion", "telefono"};
            
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                registros_que_coinciden =  Conexion_ventana_consultas.ConsultarTodosLosUsuarios();
               
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = (List<String>) registros_que_coinciden.get(i);
                            
                    tabla.addRow(new Object[]{ columnas.get(0) , columnas.get(1), columnas.get(2), columnas.get(3),
                                                columnas.get(4), columnas.get(5)});


                }
                
                
                
                
            }
            
            
        }else if(OpcionCombo.getSelectedIndex() == 2){
            //si prestamos
            
            limpiar_tabla();
            titulo = new String[]{"Id libro","Libro", "Id usuario","Usuario", "Fecha de inicio", "Fecha de retorno" };
            
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                registros_que_coinciden = Conexion_ventana_consultas.ConsultarTodosLosPrestamos();
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = (List<String>) registros_que_coinciden.get(i);
                            
                    tabla.addRow(new Object[]{ columnas.get(0) , columnas.get(1), columnas.get(2), columnas.get(3), columnas.get(4), columnas.get(5)});


                }
                
            }
                
                
                
                
        }else if(OpcionCombo.getSelectedIndex() == 3){
            //si autores
            
            limpiar_tabla();
            titulo = new String[]{"Id autor", "Nombre"};
            
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                registros_que_coinciden = Conexion_ventana_consultas.ConsultarTodosLosAutores();
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = (List<String>) registros_que_coinciden.get(i);
                            
                    tabla.addRow(new Object[]{ columnas.get(0) , columnas.get(1)});


                }
                
            }
            
        }else if(OpcionCombo.getSelectedIndex() == 4){
            //si autores
            
            limpiar_tabla();
            titulo = new String[]{"Id editorial", "Nombre"};
            
            tabla.setColumnIdentifiers(titulo);
            TablaConsultas.setModel(tabla);
            
            
            if((caja_busquedas.getText()).isBlank() == false){
                
                registros_que_coinciden.clear();
                registros_que_coinciden = Conexion_ventana_consultas.ConsultarTodosLasEditoriales();
                
                
                for (int i = 0; i < registros_que_coinciden.size(); i++) {

                    columnas = (List<String>) registros_que_coinciden.get(i);
                            
                    tabla.addRow(new Object[]{ columnas.get(0) , columnas.get(1)});


                }
                
            }
            
        }
        
    }//GEN-LAST:event_OpcionComboActionPerformed

    private void buscar_botonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_botonMouseEntered

    }//GEN-LAST:event_buscar_botonMouseEntered

    private void buscar_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_botonMouseClicked
        String palabraClave = (caja_busquedas.getText());
        
        if(palabraClave.isBlank() == false && palabraClave.equalsIgnoreCase("Ingrese su consulta aquí") == false){
            
            List<Integer> listaIndex = datosTabla(palabraClave);
            limpiar_tabla();
            ColocarDatosTabla(listaIndex);
        }    
        
    }//GEN-LAST:event_buscar_botonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_consultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_consultas().setVisible(true);
            }
        });
    }
    
    
    private void limpiar_tabla(){
        for (int i = 0; i < tabla.getRowCount(); i++) {
            tabla.removeRow(i);
        i-=1;
        }
    }
    
    private List<Integer> datosTabla(String palabraClave){
        
        /*obtiene los datos de cada fila y compara a ver en
        * que filas coincide la cadena
        */
        
        String datosfila = "";
        Pattern pat = Pattern.compile(palabraClave, Pattern.CASE_INSENSITIVE);
        //nos da el index de las filas que contienen la palabra
        List<Integer> indexfilas = new ArrayList();
        
        for (int i = 0; i < registros_que_coinciden.size(); i++) {

            columnas = (List<String>) registros_que_coinciden.get(i);
            
            for(String columna : columnas){
                datosfila += " " + (columna).trim();                 
            }
            
            System.out.println(datosfila);
            Matcher comparacion = pat.matcher(datosfila);
            if (comparacion.find()) {
                indexfilas.add(i);
            }
            datosfila = "";

        }
        
        return indexfilas;
    }
    
    private void ColocarDatosTabla(List<Integer> indexfilas){
        //coloca los datos de las filas que contenian la palabra clave
        
        for (int index : indexfilas){

            columnas = (List<String>) registros_que_coinciden.get(index);
            Vector fila = new Vector();
            
            for(String columna: columnas){
                
                fila.add(columna);
            
            }
            tabla.addRow(fila);


        }
        
    }
    
    List<String> columnas;
    ArrayList registros_que_coinciden = new ArrayList<>();
    String[] titulo;
    DefaultTableModel tabla = new DefaultTableModel();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> OpcionCombo;
    private javax.swing.JTable TablaConsultas;
    private javax.swing.JPanel bg2;
    private javax.swing.JLabel buscar_boton;
    private javax.swing.JPanel buscar_panel;
    private javax.swing.JTextField caja_busquedas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_titulo2;
    private javax.swing.JPanel panel_titulo2;
    // End of variables declaration//GEN-END:variables
}
