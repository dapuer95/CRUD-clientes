/*     */ package sistema_de_gestion_de_clientes_excel;
/*     */ import com.codoid.products.fillo.Connection;
/*     */ import com.codoid.products.fillo.Fillo;
/*     */ import com.codoid.products.fillo.Recordset;
/*     */ import com.mxrck.autocompleter.TextAutoCompleter;
/*     */ import java.awt.Color;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JCheckBox;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.Border;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class panel_eliminar extends JPanel {
/*     */   int yes_no;
/*     */   int yes_no2;
/*  26 */   public String ruta2 = System.getProperty("user.dir"); public static JButton boton_eliminar;
/*     */   public static JButton boton_limpiar;
/*     */   public static JCheckBox check_nit;
/*     */   public static JCheckBox check_nombre;
/*     */   
/*     */   public panel_eliminar() {
/*  32 */     initComponents();
/*  33 */     items();
/*  34 */     txt_nit.setEditable(false);
/*  35 */     txt_nombre_eliminar.setEditable(false);
/*  36 */     txt_nit.setBackground(Color.GRAY);
/*  37 */     txt_nombre_eliminar.setBackground(Color.GRAY);
/*     */   }
/*     */   public static JLabel label_fondo; public static JLabel label_seleccione; public static JTextField txt_nit; public static JTextField txt_nombre_eliminar;
/*     */   
/*     */   public void items() {
/*  42 */     TextAutoCompleter textautocompleter = new TextAutoCompleter(txt_nombre_eliminar);
/*     */ 
/*     */     
/*     */     try {
/*  46 */       Fillo fillo1b = new Fillo();
/*  47 */       String nit = txt_nit.getText().trim();
/*     */       
/*  49 */       Connection connection1b = fillo1b.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*  50 */       String strQuery1b = "Select distinct nombre from correos ";
/*  51 */       Recordset recordset1b = connection1b.executeQuery(strQuery1b);
/*     */       
/*  53 */       while (recordset1b.next()) {
/*  54 */         textautocompleter.addItem(recordset1b.getField("nombre"));
/*     */       
/*     */       }
/*     */     
/*     */     }
/*  59 */     catch (Exception e) {
/*  60 */       JOptionPane.showMessageDialog(null, "no hay conexion");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void initComponents() {
/*  76 */     label_seleccione = new JLabel();
/*  77 */     txt_nit = new JTextField();
/*  78 */     txt_nombre_eliminar = new JTextField();
/*  79 */     boton_eliminar = new JButton();
/*  80 */     boton_limpiar = new JButton();
/*  81 */     check_nit = new JCheckBox();
/*  82 */     check_nombre = new JCheckBox();
/*  83 */     label_fondo = new JLabel();
/*     */     
/*  85 */     setBackground(new Color(255, 255, 255));
/*  86 */     setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/*  88 */     label_seleccione.setFont(new Font("Tahoma", 0, 18));
/*  89 */     label_seleccione.setText("Seleccione un metodo de busqueda");
/*  90 */     add(label_seleccione, new AbsoluteConstraints(48, 55, -1, -1));
/*  91 */     add(txt_nit, new AbsoluteConstraints(48, 123, 96, -1));
/*     */     
/*  93 */     txt_nombre_eliminar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/*  95 */             panel_eliminar.this.txt_nombre_eliminarActionPerformed(evt);
/*     */           }
/*     */         });
/*  98 */     add(txt_nombre_eliminar, new AbsoluteConstraints(174, 123, 290, -1));
/*     */     
/* 100 */     boton_eliminar.setBackground(new Color(255, 255, 255));
/* 101 */     boton_eliminar.setIcon(new ImageIcon(getClass().getResource("/images/borrar64.png")));
/* 102 */     boton_eliminar.setBorder((Border)null);
/* 103 */     boton_eliminar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 105 */             panel_eliminar.this.boton_eliminarActionPerformed(evt);
/*     */           }
/*     */         });
/* 108 */     add(boton_eliminar, new AbsoluteConstraints(48, 171, 80, 80));
/*     */     
/* 110 */     boton_limpiar.setBackground(new Color(255, 255, 255));
/* 111 */     boton_limpiar.setIcon(new ImageIcon(getClass().getResource("/images/limpiar64.png")));
/* 112 */     boton_limpiar.setBorder((Border)null);
/* 113 */     boton_limpiar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 115 */             panel_eliminar.this.boton_limpiarActionPerformed(evt);
/*     */           }
/*     */         });
/* 118 */     add(boton_limpiar, new AbsoluteConstraints(154, 171, 80, 80));
/*     */     
/* 120 */     check_nit.setBackground(new Color(255, 255, 255));
/* 121 */     check_nit.setText("Nit");
/* 122 */     check_nit.addItemListener(new ItemListener() {
/*     */           public void itemStateChanged(ItemEvent evt) {
/* 124 */             panel_eliminar.this.check_nitItemStateChanged(evt);
/*     */           }
/*     */         });
/* 127 */     check_nit.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 129 */             panel_eliminar.this.check_nitActionPerformed(evt);
/*     */           }
/*     */         });
/* 132 */     add(check_nit, new AbsoluteConstraints(48, 98, -1, -1));
/*     */     
/* 134 */     check_nombre.setBackground(new Color(255, 255, 255));
/* 135 */     check_nombre.setText("Nombre");
/* 136 */     check_nombre.addItemListener(new ItemListener() {
/*     */           public void itemStateChanged(ItemEvent evt) {
/* 138 */             panel_eliminar.this.check_nombreItemStateChanged(evt);
/*     */           }
/*     */         });
/* 141 */     add(check_nombre, new AbsoluteConstraints(174, 98, -1, -1));
/*     */     
/* 143 */     label_fondo.setIcon(new ImageIcon(getClass().getResource("/images/fondoblanco.png")));
/* 144 */     add(label_fondo, new AbsoluteConstraints(0, 0, 1360, 710));
/*     */   }
/*     */ 
/*     */   
/*     */   private void boton_eliminarActionPerformed(ActionEvent evt) {
/* 149 */     if (check_nit.isSelected() == true && !check_nombre.isSelected()) {
/*     */       
/*     */       try {
/* 152 */         Fillo fillo2b = new Fillo();
/* 153 */         String nit = txt_nit.getText().trim();
/*     */         
/* 155 */         Connection connection2b = fillo2b.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 156 */         String strQuery2b = "Select * from correos where nit=" + nit;
/* 157 */         Recordset recordset2b = connection2b.executeQuery(strQuery2b);
/*     */         
/* 159 */         while (recordset2b.next()) {
/*     */ 
/*     */           
/* 162 */           txt_nombre_eliminar.setText(recordset2b.getField("nombre"));
/* 163 */           String nombre = txt_nombre_eliminar.getText().trim();
/*     */           
/* 165 */           this.yes_no = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la empreasa " + nombre + "?", "Eliminar", 0);
/* 166 */           if (this.yes_no == 0) {
/*     */             try {
/* 168 */               Fillo fillo3b = new Fillo();
/*     */ 
/*     */               
/* 171 */               Connection connection3b = fillo3b.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 172 */               String strQuery3b = "Delete from correos where nit=" + nit;
/*     */ 
/*     */ 
/*     */               
/* 176 */               connection3b.executeUpdate(strQuery3b);
/* 177 */               JOptionPane.showMessageDialog(null, "La empresa " + nombre + " se ha eliminado exitosamente");
/* 178 */               connection3b.close();
/*     */             }
/* 180 */             catch (Exception e) {
/*     */               
/* 182 */               JOptionPane.showMessageDialog(null, "La empresa con NIT " + nit + " no ha sido registrada");
/*     */             } 
/*     */           }
/*     */         } 
/*     */ 
/*     */         
/* 188 */         recordset2b.close();
/* 189 */         connection2b.close();
/*     */       }
/* 191 */       catch (Exception e) {
/*     */         
/* 193 */         JOptionPane.showMessageDialog(null, "La empresa con NIT " + txt_nit.getText().trim() + " no ha sido registrada");
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 198 */     if (check_nombre.isSelected() == true && !check_nit.isSelected()) {
/*     */       
/*     */       try {
/* 201 */         Fillo fillo4b = new Fillo();
/* 202 */         String nombre = txt_nombre_eliminar.getText().trim();
/*     */         
/* 204 */         Connection connection4b = fillo4b.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 205 */         String strQuery4b = "Select * from correos where nombre='" + nombre + "'";
/* 206 */         Recordset recordset4b = connection4b.executeQuery(strQuery4b);
/*     */         
/* 208 */         while (recordset4b.next()) {
/*     */           
/* 210 */           txt_nit.setText(recordset4b.getField("nit"));
/* 211 */           this.yes_no2 = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la empreasa " + nombre + "?", "Eliminar", 0);
/* 212 */           if (this.yes_no2 == 0) {
/*     */             try {
/* 214 */               Fillo fillo5b = new Fillo();
/*     */ 
/*     */               
/* 217 */               Connection connection5b = fillo5b.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 218 */               String strQuery5b = "Delete from correos where nombre='" + nombre + "'";
/*     */ 
/*     */               
/* 221 */               connection5b.executeUpdate(strQuery5b);
/* 222 */               JOptionPane.showMessageDialog(null, "La empresa " + nombre + " se ha eliminado exitosamente");
/* 223 */               connection5b.close();
/*     */             }
/* 225 */             catch (Exception e) {
/*     */               
/* 227 */               JOptionPane.showMessageDialog(null, "La empresa con NIT " + nombre + " no ha sido registrada");
/*     */             } 
/*     */           }
/*     */         } 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 235 */         recordset4b.close();
/* 236 */         connection4b.close();
/*     */       }
/* 238 */       catch (Exception e) {
/*     */         
/* 240 */         JOptionPane.showMessageDialog(null, "La empresa " + txt_nombre_eliminar.getText().trim() + " no ha sido registrada");
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 246 */     if (!check_nombre.isSelected() && !check_nit.isSelected())
/*     */     {
/* 248 */       JOptionPane.showMessageDialog(null, "Seleccione un metodo de busqueda");
/*     */     }
/* 250 */     Limpiar();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void boton_limpiarActionPerformed(ActionEvent evt) {
/* 256 */     txt_nit.setText((String)null);
/* 257 */     txt_nombre_eliminar.setText((String)null);
/*     */ 
/*     */     
/* 260 */     check_nit.setSelected(false);
/* 261 */     check_nombre.setSelected(false);
/* 262 */     check_nit.setEnabled(true);
/* 263 */     check_nombre.setEnabled(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nitItemStateChanged(ItemEvent evt) {
/* 270 */     if (check_nit.isSelected() == true) {
/* 271 */       txt_nit.setEditable(true);
/* 272 */       txt_nit.setBackground(Color.WHITE);
/* 273 */       check_nombre.setEnabled(false);
/* 274 */       txt_nombre_eliminar.setEditable(false);
/*     */     } else {
/* 276 */       txt_nit.setEditable(false);
/* 277 */       txt_nit.setBackground(Color.GRAY);
/* 278 */       check_nombre.setEnabled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nombreItemStateChanged(ItemEvent evt) {
/* 286 */     if (check_nombre.isSelected() == true) {
/* 287 */       txt_nombre_eliminar.setEditable(true);
/* 288 */       txt_nombre_eliminar.setBackground(Color.WHITE);
/* 289 */       check_nit.setEnabled(false);
/* 290 */       txt_nit.setEditable(false);
/*     */     } else {
/* 292 */       txt_nombre_eliminar.setEditable(false);
/* 293 */       txt_nombre_eliminar.setBackground(Color.GRAY);
/* 294 */       check_nit.setEnabled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void txt_nombre_eliminarActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nitActionPerformed(ActionEvent evt) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public void Limpiar() {
/* 310 */     txt_nit.setText((String)null);
/* 311 */     txt_nombre_eliminar.setText((String)null);
/*     */ 
/*     */     
/* 314 */     check_nit.setSelected(false);
/* 315 */     check_nombre.setSelected(false);
/* 316 */     check_nit.setEnabled(true);
/* 317 */     check_nombre.setEnabled(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\David\Desktop\Programa_cliente\Programa\dist\Sistema de gestion de clientes.jar!\sistema_de_gestion_de_clientes_excel\panel_eliminar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */