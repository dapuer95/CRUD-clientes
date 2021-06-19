/*     */ package sistema_de_gestion_de_clientes_excel;
/*     */ import com.codoid.products.exception.FilloException;
/*     */ import com.codoid.products.fillo.Connection;
/*     */ import com.codoid.products.fillo.Fillo;
/*     */ import com.codoid.products.fillo.Recordset;
/*     */ import com.mxrck.autocompleter.TextAutoCompleter;
/*     */ import java.awt.Color;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.ItemEvent;
/*     */ import java.awt.event.ItemListener;
/*     */ import java.util.logging.Level;
/*     */ import java.util.logging.Logger;
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
/*     */ public class panel_editar extends JPanel {
/*     */   public int yes_no;
/*     */   public String nit_busqueda;
/*  27 */   public String ruta2 = System.getProperty("user.dir"); public static JButton boton_cambios; public static JButton boton_consultar; public static JButton boton_limpiar; public static JCheckBox check_nit; public static JCheckBox check_nombre; public static JLabel label_cargo1; public static JLabel label_cargo2; public static JLabel label_cargo3; public static JLabel label_cargo4; public static JLabel label_celular1; public static JLabel label_celular2; public static JLabel label_celular3; public static JLabel label_celular4; public static JLabel label_ciudad; public static JLabel label_contacto1; public static JLabel label_contacto2; public static JLabel label_contacto3; public static JLabel label_contacto4; public static JLabel label_contactofac; public static JLabel label_correo1; public static JLabel label_correo2; public static JLabel label_correo3; public static JLabel label_correo4; public static JLabel label_correofac; public static JLabel label_direccion; public static JLabel label_fondo; public static JLabel label_razon; public static JLabel label_seleccione; public static JLabel label_telefono11; public static JLabel label_telefono12; public static JLabel label_telefono13; public static JLabel label_telefono21; public static JLabel label_telefono22; public static JLabel label_telefono23;
/*     */   public static JLabel label_telefono31;
/*     */   public static JLabel label_telefono32;
/*     */   public static JLabel label_telefono33;
/*     */   
/*     */   public panel_editar() {
/*  33 */     initComponents();
/*  34 */     items();
/*  35 */     txt_nit.setEditable(false);
/*  36 */     txt_nombre_editar.setEditable(false);
/*  37 */     txt_nit.setBackground(Color.GRAY);
/*  38 */     txt_nombre_editar.setBackground(Color.GRAY);
/*     */   }
/*     */   public static JLabel label_telefono41; public static JLabel label_telefono42; public static JLabel label_telefono43; public static JTextField txt_cargo1; public static JTextField txt_cargo2; public static JTextField txt_cargo3; public static JTextField txt_cargo4; public static JTextField txt_celular1; public static JTextField txt_celular2; public static JTextField txt_celular3; public static JTextField txt_celular4; public static JTextField txt_ciudad; public static JTextField txt_contacto1; public static JTextField txt_contacto2; public static JTextField txt_contacto3; public static JTextField txt_contacto4; public static JTextField txt_contactofac; public static JTextField txt_correo1; public static JTextField txt_correo2; public static JTextField txt_correo3; public static JTextField txt_correo4; public static JTextField txt_correofac; public static JTextField txt_direccion; public static JTextField txt_nit; public static JTextField txt_nombre_editar; public static JTextField txt_razon; public static JTextField txt_telefono11; public static JTextField txt_telefono12; public static JTextField txt_telefono13; public static JTextField txt_telefono21; public static JTextField txt_telefono22; public static JTextField txt_telefono23; public static JTextField txt_telefono31; public static JTextField txt_telefono32; public static JTextField txt_telefono33; public static JTextField txt_telefono41; public static JTextField txt_telefono42; public static JTextField txt_telefono43;
/*     */   
/*     */   public void items() {
/*  43 */     TextAutoCompleter textautocompleter = new TextAutoCompleter(txt_nombre_editar);
/*     */ 
/*     */     
/*     */     try {
/*  47 */       Fillo fillo1e = new Fillo();
/*  48 */       String nit = txt_nit.getText().trim();
/*     */       
/*  50 */       Connection connection1e = fillo1e.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*  51 */       String strQuery1e = "Select distinct nombre from correos ";
/*  52 */       Recordset recordset1e = connection1e.executeQuery(strQuery1e);
/*     */       
/*  54 */       while (recordset1e.next()) {
/*  55 */         textautocompleter.addItem(recordset1e.getField("nombre"));
/*     */       }
/*     */       
/*  58 */       recordset1e.close();
/*  59 */       connection1e.close();
/*     */     }
/*  61 */     catch (Exception e) {
/*  62 */       JOptionPane.showMessageDialog(null, "no hay conexion");
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
/*  78 */     label_seleccione = new JLabel();
/*  79 */     txt_nit = new JTextField();
/*  80 */     txt_nombre_editar = new JTextField();
/*  81 */     boton_consultar = new JButton();
/*  82 */     boton_limpiar = new JButton();
/*  83 */     txt_razon = new JTextField();
/*  84 */     label_razon = new JLabel();
/*  85 */     label_ciudad = new JLabel();
/*  86 */     txt_ciudad = new JTextField();
/*  87 */     txt_direccion = new JTextField();
/*  88 */     label_direccion = new JLabel();
/*  89 */     txt_contacto1 = new JTextField();
/*  90 */     label_contacto1 = new JLabel();
/*  91 */     label_cargo1 = new JLabel();
/*  92 */     txt_cargo1 = new JTextField();
/*  93 */     label_correo1 = new JLabel();
/*  94 */     txt_correo1 = new JTextField();
/*  95 */     txt_celular1 = new JTextField();
/*  96 */     label_celular1 = new JLabel();
/*  97 */     label_telefono11 = new JLabel();
/*  98 */     txt_telefono11 = new JTextField();
/*  99 */     txt_telefono12 = new JTextField();
/* 100 */     label_telefono12 = new JLabel();
/* 101 */     txt_telefono13 = new JTextField();
/* 102 */     label_telefono13 = new JLabel();
/* 103 */     label_contacto2 = new JLabel();
/* 104 */     txt_contacto2 = new JTextField();
/* 105 */     label_cargo2 = new JLabel();
/* 106 */     txt_cargo2 = new JTextField();
/* 107 */     label_correo2 = new JLabel();
/* 108 */     txt_correo2 = new JTextField();
/* 109 */     label_celular2 = new JLabel();
/* 110 */     txt_celular2 = new JTextField();
/* 111 */     label_telefono21 = new JLabel();
/* 112 */     txt_telefono21 = new JTextField();
/* 113 */     txt_telefono22 = new JTextField();
/* 114 */     label_telefono22 = new JLabel();
/* 115 */     label_telefono23 = new JLabel();
/* 116 */     txt_telefono23 = new JTextField();
/* 117 */     label_contacto3 = new JLabel();
/* 118 */     txt_contacto3 = new JTextField();
/* 119 */     label_cargo3 = new JLabel();
/* 120 */     txt_cargo3 = new JTextField();
/* 121 */     label_correo3 = new JLabel();
/* 122 */     txt_correo3 = new JTextField();
/* 123 */     label_celular3 = new JLabel();
/* 124 */     txt_celular3 = new JTextField();
/* 125 */     label_telefono31 = new JLabel();
/* 126 */     txt_telefono31 = new JTextField();
/* 127 */     label_telefono32 = new JLabel();
/* 128 */     txt_telefono32 = new JTextField();
/* 129 */     label_telefono33 = new JLabel();
/* 130 */     txt_telefono33 = new JTextField();
/* 131 */     txt_celular4 = new JTextField();
/* 132 */     label_contacto4 = new JLabel();
/* 133 */     label_telefono43 = new JLabel();
/* 134 */     label_celular4 = new JLabel();
/* 135 */     label_telefono41 = new JLabel();
/* 136 */     txt_correo4 = new JTextField();
/* 137 */     txt_telefono43 = new JTextField();
/* 138 */     label_correo4 = new JLabel();
/* 139 */     txt_contacto4 = new JTextField();
/* 140 */     label_telefono42 = new JLabel();
/* 141 */     txt_telefono42 = new JTextField();
/* 142 */     txt_cargo4 = new JTextField();
/* 143 */     label_cargo4 = new JLabel();
/* 144 */     txt_telefono41 = new JTextField();
/* 145 */     label_contactofac = new JLabel();
/* 146 */     txt_contactofac = new JTextField();
/* 147 */     label_correofac = new JLabel();
/* 148 */     txt_correofac = new JTextField();
/* 149 */     check_nit = new JCheckBox();
/* 150 */     check_nombre = new JCheckBox();
/* 151 */     boton_cambios = new JButton();
/* 152 */     label_fondo = new JLabel();
/*     */     
/* 154 */     setBackground(new Color(255, 255, 255));
/* 155 */     setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 157 */     label_seleccione.setFont(new Font("Tahoma", 0, 18));
/* 158 */     label_seleccione.setText("Seleccione un metodo de busqueda");
/* 159 */     add(label_seleccione, new AbsoluteConstraints(10, 83, -1, -1));
/* 160 */     add(txt_nit, new AbsoluteConstraints(10, 164, 96, -1));
/* 161 */     add(txt_nombre_editar, new AbsoluteConstraints(124, 164, 251, -1));
/*     */     
/* 163 */     boton_consultar.setBackground(new Color(255, 255, 255));
/* 164 */     boton_consultar.setIcon(new ImageIcon(getClass().getResource("/images/buscar64.png")));
/* 165 */     boton_consultar.setBorder((Border)null);
/* 166 */     boton_consultar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 168 */             panel_editar.this.boton_consultarActionPerformed(evt);
/*     */           }
/*     */         });
/* 171 */     add(boton_consultar, new AbsoluteConstraints(440, 104, 80, 80));
/*     */     
/* 173 */     boton_limpiar.setBackground(new Color(255, 255, 255));
/* 174 */     boton_limpiar.setIcon(new ImageIcon(getClass().getResource("/images/limpiar64.png")));
/* 175 */     boton_limpiar.setBorder((Border)null);
/* 176 */     boton_limpiar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 178 */             panel_editar.this.boton_limpiarActionPerformed(evt);
/*     */           }
/*     */         });
/* 181 */     add(boton_limpiar, new AbsoluteConstraints(655, 104, 80, 80));
/* 182 */     add(txt_razon, new AbsoluteConstraints(10, 264, 412, -1));
/*     */     
/* 184 */     label_razon.setText("Razon social");
/* 185 */     add(label_razon, new AbsoluteConstraints(10, 244, -1, -1));
/*     */     
/* 187 */     label_ciudad.setText("Ciudad");
/* 188 */     add(label_ciudad, new AbsoluteConstraints(440, 244, -1, -1));
/* 189 */     add(txt_ciudad, new AbsoluteConstraints(440, 264, 197, -1));
/* 190 */     add(txt_direccion, new AbsoluteConstraints(655, 264, 434, -1));
/*     */     
/* 192 */     label_direccion.setText("Dirección");
/* 193 */     add(label_direccion, new AbsoluteConstraints(655, 244, -1, -1));
/* 194 */     add(txt_contacto1, new AbsoluteConstraints(10, 330, 197, -1));
/*     */     
/* 196 */     label_contacto1.setText("Contacto 1");
/* 197 */     add(label_contacto1, new AbsoluteConstraints(10, 305, -1, -1));
/*     */     
/* 199 */     label_cargo1.setText("Cargo");
/* 200 */     add(label_cargo1, new AbsoluteConstraints(225, 305, -1, -1));
/* 201 */     add(txt_cargo1, new AbsoluteConstraints(225, 330, 197, -1));
/*     */     
/* 203 */     label_correo1.setText("Correo");
/* 204 */     add(label_correo1, new AbsoluteConstraints(440, 305, -1, -1));
/* 205 */     add(txt_correo1, new AbsoluteConstraints(440, 330, 197, -1));
/* 206 */     add(txt_celular1, new AbsoluteConstraints(655, 330, 95, -1));
/*     */     
/* 208 */     label_celular1.setText("Celular");
/* 209 */     add(label_celular1, new AbsoluteConstraints(655, 305, -1, -1));
/*     */     
/* 211 */     label_telefono11.setText("Telefono 1");
/* 212 */     add(label_telefono11, new AbsoluteConstraints(768, 305, -1, -1));
/* 213 */     add(txt_telefono11, new AbsoluteConstraints(768, 330, 95, -1));
/* 214 */     add(txt_telefono12, new AbsoluteConstraints(881, 330, 95, -1));
/*     */     
/* 216 */     label_telefono12.setText("Telefono 2");
/* 217 */     add(label_telefono12, new AbsoluteConstraints(881, 305, -1, -1));
/* 218 */     add(txt_telefono13, new AbsoluteConstraints(994, 330, 95, -1));
/*     */     
/* 220 */     label_telefono13.setText("Telefono 3");
/* 221 */     add(label_telefono13, new AbsoluteConstraints(994, 305, -1, -1));
/*     */     
/* 223 */     label_contacto2.setText("Contacto 2");
/* 224 */     add(label_contacto2, new AbsoluteConstraints(10, 380, -1, -1));
/* 225 */     add(txt_contacto2, new AbsoluteConstraints(10, 405, 197, -1));
/*     */     
/* 227 */     label_cargo2.setText("Cargo");
/* 228 */     add(label_cargo2, new AbsoluteConstraints(225, 380, -1, -1));
/* 229 */     add(txt_cargo2, new AbsoluteConstraints(225, 405, 197, -1));
/*     */     
/* 231 */     label_correo2.setText("Correo");
/* 232 */     add(label_correo2, new AbsoluteConstraints(440, 380, -1, -1));
/* 233 */     add(txt_correo2, new AbsoluteConstraints(440, 405, 197, -1));
/*     */     
/* 235 */     label_celular2.setText("Celular");
/* 236 */     add(label_celular2, new AbsoluteConstraints(655, 380, -1, -1));
/* 237 */     add(txt_celular2, new AbsoluteConstraints(655, 405, 95, -1));
/*     */     
/* 239 */     label_telefono21.setText("Telefono 1");
/* 240 */     add(label_telefono21, new AbsoluteConstraints(768, 380, -1, -1));
/* 241 */     add(txt_telefono21, new AbsoluteConstraints(768, 405, 95, -1));
/* 242 */     add(txt_telefono22, new AbsoluteConstraints(881, 405, 95, -1));
/*     */     
/* 244 */     label_telefono22.setText("Telefono 2");
/* 245 */     add(label_telefono22, new AbsoluteConstraints(881, 380, -1, -1));
/*     */     
/* 247 */     label_telefono23.setText("Telefono 3");
/* 248 */     add(label_telefono23, new AbsoluteConstraints(994, 380, -1, -1));
/* 249 */     add(txt_telefono23, new AbsoluteConstraints(994, 405, 95, -1));
/*     */     
/* 251 */     label_contacto3.setText("Contacto 3");
/* 252 */     add(label_contacto3, new AbsoluteConstraints(10, 455, -1, -1));
/* 253 */     add(txt_contacto3, new AbsoluteConstraints(10, 480, 197, -1));
/*     */     
/* 255 */     label_cargo3.setText("Cargo");
/* 256 */     add(label_cargo3, new AbsoluteConstraints(225, 455, -1, -1));
/* 257 */     add(txt_cargo3, new AbsoluteConstraints(225, 480, 197, -1));
/*     */     
/* 259 */     label_correo3.setText("Correo");
/* 260 */     add(label_correo3, new AbsoluteConstraints(440, 455, -1, -1));
/* 261 */     add(txt_correo3, new AbsoluteConstraints(440, 480, 197, -1));
/*     */     
/* 263 */     label_celular3.setText("Celular");
/* 264 */     add(label_celular3, new AbsoluteConstraints(655, 455, -1, -1));
/* 265 */     add(txt_celular3, new AbsoluteConstraints(655, 480, 95, -1));
/*     */     
/* 267 */     label_telefono31.setText("Telefono 1");
/* 268 */     add(label_telefono31, new AbsoluteConstraints(768, 455, -1, -1));
/* 269 */     add(txt_telefono31, new AbsoluteConstraints(768, 480, 95, -1));
/*     */     
/* 271 */     label_telefono32.setText("Telefono 2");
/* 272 */     add(label_telefono32, new AbsoluteConstraints(881, 455, -1, -1));
/* 273 */     add(txt_telefono32, new AbsoluteConstraints(881, 480, 95, -1));
/*     */     
/* 275 */     label_telefono33.setText("Telefono 3");
/* 276 */     add(label_telefono33, new AbsoluteConstraints(994, 455, -1, -1));
/* 277 */     add(txt_telefono33, new AbsoluteConstraints(994, 480, 95, -1));
/* 278 */     add(txt_celular4, new AbsoluteConstraints(655, 555, 95, -1));
/*     */     
/* 280 */     label_contacto4.setText("Contacto 4");
/* 281 */     add(label_contacto4, new AbsoluteConstraints(10, 530, -1, -1));
/*     */     
/* 283 */     label_telefono43.setText("Telefono 3");
/* 284 */     add(label_telefono43, new AbsoluteConstraints(994, 530, -1, -1));
/*     */     
/* 286 */     label_celular4.setText("Celular");
/* 287 */     add(label_celular4, new AbsoluteConstraints(655, 530, -1, -1));
/*     */     
/* 289 */     label_telefono41.setText("Telefono 1");
/* 290 */     add(label_telefono41, new AbsoluteConstraints(768, 530, -1, -1));
/* 291 */     add(txt_correo4, new AbsoluteConstraints(440, 555, 197, -1));
/* 292 */     add(txt_telefono43, new AbsoluteConstraints(994, 555, 95, -1));
/*     */     
/* 294 */     label_correo4.setText("Correo");
/* 295 */     add(label_correo4, new AbsoluteConstraints(440, 530, -1, -1));
/* 296 */     add(txt_contacto4, new AbsoluteConstraints(10, 555, 197, -1));
/*     */     
/* 298 */     label_telefono42.setText("Telefono 2");
/* 299 */     add(label_telefono42, new AbsoluteConstraints(881, 530, -1, -1));
/* 300 */     add(txt_telefono42, new AbsoluteConstraints(881, 555, 95, -1));
/* 301 */     add(txt_cargo4, new AbsoluteConstraints(225, 555, 197, -1));
/*     */     
/* 303 */     label_cargo4.setText("Cargo");
/* 304 */     add(label_cargo4, new AbsoluteConstraints(230, 530, 50, 20));
/* 305 */     add(txt_telefono41, new AbsoluteConstraints(768, 555, 95, -1));
/*     */     
/* 307 */     label_contactofac.setText("Contacto facturación");
/* 308 */     add(label_contactofac, new AbsoluteConstraints(10, 605, -1, -1));
/* 309 */     add(txt_contactofac, new AbsoluteConstraints(10, 630, 197, -1));
/*     */     
/* 311 */     label_correofac.setText("Correo facturación");
/* 312 */     add(label_correofac, new AbsoluteConstraints(225, 605, -1, -1));
/* 313 */     add(txt_correofac, new AbsoluteConstraints(225, 630, 197, -1));
/*     */     
/* 315 */     check_nit.setBackground(new Color(255, 255, 255));
/* 316 */     check_nit.setText("Nit");
/* 317 */     check_nit.addItemListener(new ItemListener() {
/*     */           public void itemStateChanged(ItemEvent evt) {
/* 319 */             panel_editar.this.check_nitItemStateChanged(evt);
/*     */           }
/*     */         });
/* 322 */     add(check_nit, new AbsoluteConstraints(10, 139, -1, -1));
/*     */     
/* 324 */     check_nombre.setBackground(new Color(255, 255, 255));
/* 325 */     check_nombre.setText("Nombre");
/* 326 */     check_nombre.addItemListener(new ItemListener() {
/*     */           public void itemStateChanged(ItemEvent evt) {
/* 328 */             panel_editar.this.check_nombreItemStateChanged(evt);
/*     */           }
/*     */         });
/* 331 */     add(check_nombre, new AbsoluteConstraints(124, 139, -1, -1));
/*     */     
/* 333 */     boton_cambios.setBackground(new Color(255, 255, 255));
/* 334 */     boton_cambios.setIcon(new ImageIcon(getClass().getResource("/images/guardar64.png")));
/* 335 */     boton_cambios.setBorder((Border)null);
/* 336 */     boton_cambios.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 338 */             panel_editar.this.boton_cambiosActionPerformed(evt);
/*     */           }
/*     */         });
/* 341 */     add(boton_cambios, new AbsoluteConstraints(548, 104, 80, 80));
/*     */     
/* 343 */     label_fondo.setIcon(new ImageIcon(getClass().getResource("/images/fondoblanco2.png")));
/* 344 */     add(label_fondo, new AbsoluteConstraints(0, 0, 1360, 710));
/*     */   }
/*     */ 
/*     */   
/*     */   private void boton_consultarActionPerformed(ActionEvent evt) {
/* 349 */     txt_nombre_editar.setEditable(true);
/* 350 */     txt_nit.setEditable(true);
/* 351 */     txt_nit.setBackground(Color.WHITE);
/* 352 */     txt_nombre_editar.setBackground(Color.WHITE);
/*     */     
/* 354 */     if (check_nit.isSelected() == true && !check_nombre.isSelected()) {
/*     */       
/*     */       try {
/* 357 */         Fillo fillo2e = new Fillo();
/* 358 */         String nit = txt_nit.getText().trim();
/*     */         
/* 360 */         Connection connection2e = fillo2e.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 361 */         String strQuery2e = "Select * from correos where nit=" + nit;
/* 362 */         Recordset recordset2e = connection2e.executeQuery(strQuery2e);
/*     */         
/* 364 */         while (recordset2e.next()) {
/*     */ 
/*     */           
/* 367 */           this.nit_busqueda = txt_nit.getText().trim();
/* 368 */           txt_nombre_editar.setText(recordset2e.getField("nombre"));
/* 369 */           txt_razon.setText(recordset2e.getField("razonsocial"));
/* 370 */           txt_ciudad.setText(recordset2e.getField("ciudad"));
/* 371 */           txt_direccion.setText(recordset2e.getField("direccion"));
/*     */ 
/*     */           
/* 374 */           txt_contacto1.setText(recordset2e.getField("contacto1"));
/* 375 */           txt_cargo1.setText(recordset2e.getField("cargo1"));
/* 376 */           txt_celular1.setText(recordset2e.getField("celular1"));
/* 377 */           txt_correo1.setText(recordset2e.getField("correo1"));
/* 378 */           txt_telefono11.setText(recordset2e.getField("telefono11"));
/* 379 */           txt_telefono12.setText(recordset2e.getField("telefono12"));
/* 380 */           txt_telefono13.setText(recordset2e.getField("telefono13"));
/*     */ 
/*     */           
/* 383 */           txt_contacto2.setText(recordset2e.getField("contacto2"));
/* 384 */           txt_cargo2.setText(recordset2e.getField("cargo2"));
/* 385 */           txt_celular2.setText(recordset2e.getField("celular2"));
/* 386 */           txt_correo2.setText(recordset2e.getField("correo2"));
/* 387 */           txt_telefono21.setText(recordset2e.getField("telefono21"));
/* 388 */           txt_telefono22.setText(recordset2e.getField("telefono22"));
/* 389 */           txt_telefono23.setText(recordset2e.getField("telefono23"));
/*     */ 
/*     */           
/* 392 */           txt_contacto3.setText(recordset2e.getField("contacto3"));
/* 393 */           txt_cargo3.setText(recordset2e.getField("cargo3"));
/* 394 */           txt_celular3.setText(recordset2e.getField("celular3"));
/* 395 */           txt_correo3.setText(recordset2e.getField("correo3"));
/* 396 */           txt_telefono31.setText(recordset2e.getField("telefono31"));
/* 397 */           txt_telefono32.setText(recordset2e.getField("telefono32"));
/* 398 */           txt_telefono33.setText(recordset2e.getField("telefono33"));
/*     */ 
/*     */           
/* 401 */           txt_contacto4.setText(recordset2e.getField("contacto4"));
/* 402 */           txt_cargo4.setText(recordset2e.getField("cargo4"));
/* 403 */           txt_celular4.setText(recordset2e.getField("celular4"));
/* 404 */           txt_correo4.setText(recordset2e.getField("correo4"));
/* 405 */           txt_telefono41.setText(recordset2e.getField("telefono41"));
/* 406 */           txt_telefono42.setText(recordset2e.getField("telefono42"));
/* 407 */           txt_telefono43.setText(recordset2e.getField("telefono43"));
/*     */           
/* 409 */           txt_contactofac.setText(recordset2e.getField("contactofac"));
/* 410 */           txt_correofac.setText(recordset2e.getField("correofac"));
/*     */         } 
/*     */         
/* 413 */         recordset2e.close();
/* 414 */         connection2e.close();
/*     */       }
/* 416 */       catch (FilloException ex) {
/* 417 */         Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ex);
/* 418 */         JOptionPane.showMessageDialog(null, "La empresa con NIT " + txt_nit.getText().trim() + " no ha sido registrada");
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 423 */     if (check_nombre.isSelected() == true && !check_nit.isSelected()) {
/*     */       
/*     */       try {
/* 426 */         Fillo fillo3e = new Fillo();
/* 427 */         String nombre = txt_nombre_editar.getText().trim();
/*     */         
/* 429 */         Connection connection3e = fillo3e.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 430 */         String strQuery3e = "Select * from correos where nombre='" + nombre + "'";
/* 431 */         Recordset recordset3e = connection3e.executeQuery(strQuery3e);
/*     */         
/* 433 */         while (recordset3e.next()) {
/*     */ 
/*     */           
/* 436 */           txt_nit.setText(recordset3e.getField("nit"));
/* 437 */           this.nit_busqueda = txt_nit.getText().trim();
/* 438 */           txt_razon.setText(recordset3e.getField("razonsocial"));
/* 439 */           txt_ciudad.setText(recordset3e.getField("ciudad"));
/* 440 */           txt_direccion.setText(recordset3e.getField("direccion"));
/*     */ 
/*     */           
/* 443 */           txt_contacto1.setText(recordset3e.getField("contacto1"));
/* 444 */           txt_cargo1.setText(recordset3e.getField("cargo1"));
/* 445 */           txt_celular1.setText(recordset3e.getField("celular1"));
/* 446 */           txt_correo1.setText(recordset3e.getField("correo1"));
/* 447 */           txt_telefono11.setText(recordset3e.getField("telefono11"));
/* 448 */           txt_telefono12.setText(recordset3e.getField("telefono12"));
/* 449 */           txt_telefono13.setText(recordset3e.getField("telefono13"));
/*     */ 
/*     */           
/* 452 */           txt_contacto2.setText(recordset3e.getField("contacto2"));
/* 453 */           txt_cargo2.setText(recordset3e.getField("cargo2"));
/* 454 */           txt_celular2.setText(recordset3e.getField("celular2"));
/* 455 */           txt_correo2.setText(recordset3e.getField("correo2"));
/* 456 */           txt_telefono21.setText(recordset3e.getField("telefono21"));
/* 457 */           txt_telefono22.setText(recordset3e.getField("telefono22"));
/* 458 */           txt_telefono23.setText(recordset3e.getField("telefono23"));
/*     */ 
/*     */           
/* 461 */           txt_contacto3.setText(recordset3e.getField("contacto3"));
/* 462 */           txt_cargo3.setText(recordset3e.getField("cargo3"));
/* 463 */           txt_celular3.setText(recordset3e.getField("celular3"));
/* 464 */           txt_correo3.setText(recordset3e.getField("correo3"));
/* 465 */           txt_telefono31.setText(recordset3e.getField("telefono31"));
/* 466 */           txt_telefono32.setText(recordset3e.getField("telefono32"));
/* 467 */           txt_telefono33.setText(recordset3e.getField("telefono33"));
/*     */ 
/*     */           
/* 470 */           txt_contacto4.setText(recordset3e.getField("contacto4"));
/* 471 */           txt_cargo4.setText(recordset3e.getField("cargo4"));
/* 472 */           txt_celular4.setText(recordset3e.getField("celular4"));
/* 473 */           txt_correo4.setText(recordset3e.getField("correo4"));
/* 474 */           txt_telefono41.setText(recordset3e.getField("telefono41"));
/* 475 */           txt_telefono42.setText(recordset3e.getField("telefono42"));
/* 476 */           txt_telefono43.setText(recordset3e.getField("telefono43"));
/*     */           
/* 478 */           txt_contactofac.setText(recordset3e.getField("contactofac"));
/* 479 */           txt_correofac.setText(recordset3e.getField("correofac"));
/*     */         } 
/*     */         
/* 482 */         recordset3e.close();
/* 483 */         connection3e.close();
/*     */       }
/* 485 */       catch (FilloException ex) {
/* 486 */         Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ex);
/* 487 */         JOptionPane.showMessageDialog(null, "La empresa " + txt_nombre_editar.getText().trim() + " no ha sido registrada");
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 494 */     if (!check_nombre.isSelected() && !check_nit.isSelected()) {
/* 495 */       txt_nit.setBackground(Color.GRAY);
/* 496 */       txt_nombre_editar.setBackground(Color.GRAY);
/* 497 */       JOptionPane.showMessageDialog(null, "Seleccione un metodo de busqueda");
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void boton_limpiarActionPerformed(ActionEvent evt) {
/* 504 */     txt_nit.setText((String)null);
/* 505 */     txt_nombre_editar.setText((String)null);
/* 506 */     txt_razon.setText((String)null);
/* 507 */     txt_ciudad.setText((String)null);
/* 508 */     txt_direccion.setText((String)null);
/*     */ 
/*     */     
/* 511 */     txt_contacto1.setText((String)null);
/* 512 */     txt_cargo1.setText((String)null);
/* 513 */     txt_celular1.setText((String)null);
/* 514 */     txt_correo1.setText((String)null);
/* 515 */     txt_telefono11.setText((String)null);
/* 516 */     txt_telefono12.setText((String)null);
/* 517 */     txt_telefono13.setText((String)null);
/*     */ 
/*     */     
/* 520 */     txt_contacto2.setText((String)null);
/* 521 */     txt_cargo2.setText((String)null);
/* 522 */     txt_celular2.setText((String)null);
/* 523 */     txt_correo2.setText((String)null);
/* 524 */     txt_telefono21.setText((String)null);
/* 525 */     txt_telefono22.setText((String)null);
/* 526 */     txt_telefono23.setText((String)null);
/*     */ 
/*     */     
/* 529 */     txt_contacto3.setText((String)null);
/* 530 */     txt_cargo3.setText((String)null);
/* 531 */     txt_celular3.setText((String)null);
/* 532 */     txt_correo3.setText((String)null);
/* 533 */     txt_telefono31.setText((String)null);
/* 534 */     txt_telefono32.setText((String)null);
/* 535 */     txt_telefono33.setText((String)null);
/*     */ 
/*     */     
/* 538 */     txt_contacto4.setText((String)null);
/* 539 */     txt_cargo4.setText((String)null);
/* 540 */     txt_celular4.setText((String)null);
/* 541 */     txt_correo4.setText((String)null);
/* 542 */     txt_telefono41.setText((String)null);
/* 543 */     txt_telefono42.setText((String)null);
/* 544 */     txt_telefono43.setText((String)null);
/*     */ 
/*     */     
/* 547 */     txt_contactofac.setText((String)null);
/* 548 */     txt_correofac.setText((String)null);
/*     */ 
/*     */ 
/*     */     
/* 552 */     check_nit.setSelected(false);
/* 553 */     check_nombre.setSelected(false);
/* 554 */     check_nit.setEnabled(true);
/* 555 */     check_nombre.setEnabled(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nitItemStateChanged(ItemEvent evt) {
/* 562 */     if (check_nit.isSelected() == true) {
/* 563 */       txt_nit.setEditable(true);
/* 564 */       txt_nit.setBackground(Color.WHITE);
/* 565 */       check_nombre.setEnabled(false);
/* 566 */       txt_nombre_editar.setEditable(false);
/*     */     } else {
/* 568 */       txt_nit.setEditable(false);
/* 569 */       txt_nit.setBackground(Color.GRAY);
/* 570 */       check_nombre.setEnabled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nombreItemStateChanged(ItemEvent evt) {
/* 578 */     if (check_nombre.isSelected() == true) {
/* 579 */       txt_nombre_editar.setEditable(true);
/* 580 */       txt_nombre_editar.setBackground(Color.WHITE);
/* 581 */       check_nit.setEnabled(false);
/* 582 */       txt_nit.setEditable(false);
/*     */     } else {
/* 584 */       txt_nombre_editar.setEditable(false);
/* 585 */       txt_nombre_editar.setBackground(Color.GRAY);
/* 586 */       check_nit.setEnabled(true);
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
/*     */   private void boton_cambiosActionPerformed(ActionEvent evt) {
/* 602 */     String nit = txt_nit.getText().trim();
/* 603 */     String razon = txt_razon.getText().trim();
/* 604 */     String nombre = txt_nombre_editar.getText().trim();
/* 605 */     String ciudad = txt_ciudad.getText().trim();
/* 606 */     String direccion = txt_direccion.getText().trim();
/*     */     
/* 608 */     String contacto1 = txt_contacto1.getText().trim();
/* 609 */     String cargo1 = txt_cargo1.getText().trim();
/* 610 */     String correo1 = txt_correo1.getText().trim();
/* 611 */     String celular1 = txt_celular1.getText().trim();
/* 612 */     String telefono11 = txt_telefono11.getText().trim();
/* 613 */     String telefono12 = txt_telefono12.getText().trim();
/* 614 */     String telefono13 = txt_telefono13.getText().trim();
/*     */     
/* 616 */     String contacto2 = txt_contacto2.getText().trim();
/* 617 */     String cargo2 = txt_cargo2.getText().trim();
/* 618 */     String correo2 = txt_correo2.getText().trim();
/* 619 */     String celular2 = txt_celular2.getText().trim();
/* 620 */     String telefono21 = txt_telefono21.getText().trim();
/* 621 */     String telefono22 = txt_telefono22.getText().trim();
/* 622 */     String telefono23 = txt_telefono23.getText().trim();
/*     */     
/* 624 */     String contacto3 = txt_contacto3.getText().trim();
/* 625 */     String cargo3 = txt_cargo3.getText().trim();
/* 626 */     String correo3 = txt_correo3.getText().trim();
/* 627 */     String celular3 = txt_celular3.getText().trim();
/* 628 */     String telefono31 = txt_telefono31.getText().trim();
/* 629 */     String telefono32 = txt_telefono32.getText().trim();
/* 630 */     String telefono33 = txt_telefono33.getText().trim();
/*     */     
/* 632 */     String contacto4 = txt_contacto4.getText().trim();
/* 633 */     String cargo4 = txt_cargo4.getText().trim();
/* 634 */     String correo4 = txt_correo4.getText().trim();
/* 635 */     String celular4 = txt_celular4.getText().trim();
/* 636 */     String telefono41 = txt_telefono41.getText().trim();
/* 637 */     String telefono42 = txt_telefono42.getText().trim();
/* 638 */     String telefono43 = txt_telefono43.getText().trim();
/*     */     
/* 640 */     String contactofac = txt_contactofac.getText().trim();
/* 641 */     String correofac = txt_correofac.getText().trim();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 647 */     this.yes_no = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios en la empresa " + nombre + "?", "Guardar cambios", 0);
/*     */ 
/*     */     
/* 650 */     if (this.yes_no == 0) {
/*     */       
/*     */       try {
/*     */ 
/*     */ 
/*     */         
/* 656 */         Fillo fillo4e = new Fillo();
/* 657 */         Connection connection4e = fillo4e.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*     */         
/* 659 */         String strQuery4e = "Update correos Set nit='" + nit + "',nombre='" + nombre + "',razonsocial='" + razon + "',ciudad='" + ciudad + "',direccion='" + direccion + "',contacto1='" + contacto1 + "',cargo1='" + cargo1 + "',correo1='" + correo1 + "',celular1='" + celular1 + "',telefono11='" + telefono11 + "',telefono12='" + telefono12 + "',telefono13='" + telefono13 + "',contacto2='" + contacto2 + "',cargo2='" + cargo2 + "',correo2='" + correo2 + "',celular2='" + celular2 + "',telefono21='" + telefono21 + "',telefono22='" + telefono22 + "',telefono23='" + telefono23 + "',contacto3='" + contacto3 + "',cargo3='" + cargo3 + "',correo3='" + correo3 + "',celular3='" + celular3 + "',telefono31='" + telefono31 + "',telefono32='" + telefono32 + "',telefono33='" + telefono33 + "',contacto4='" + contacto4 + "',cargo4='" + cargo4 + "',correo4='" + correo4 + "',celular4='" + celular4 + "',telefono41='" + telefono41 + "',telefono42='" + telefono42 + "',telefono43='" + telefono43 + "',contactofac='" + contactofac + "',correofac='" + correofac + "'where nit=" + this.nit_busqueda;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 667 */         connection4e.executeUpdate(strQuery4e);
/* 668 */         JOptionPane.showMessageDialog(null, "Los cambios en la empresa " + nombre + " se han guardado");
/*     */         
/* 670 */         connection4e.close();
/* 671 */         Limpiar();
/*     */       }
/* 673 */       catch (FilloException ex) {
/* 674 */         Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ex);
/* 675 */         JOptionPane.showMessageDialog(null, "no hay conexion");
/*     */       } 
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void Limpiar() {
/* 687 */     txt_nit.setText("");
/* 688 */     txt_razon.setText("");
/* 689 */     txt_nombre_editar.setText("");
/* 690 */     txt_ciudad.setText("");
/* 691 */     txt_direccion.setText("");
/*     */     
/* 693 */     txt_contacto1.setText("");
/* 694 */     txt_cargo1.setText("");
/* 695 */     txt_correo1.setText("");
/* 696 */     txt_celular1.setText("");
/* 697 */     txt_telefono11.setText("");
/* 698 */     txt_telefono12.setText("");
/* 699 */     txt_telefono13.setText("");
/*     */     
/* 701 */     txt_contacto2.setText("");
/* 702 */     txt_cargo2.setText("");
/* 703 */     txt_correo2.setText("");
/* 704 */     txt_celular2.setText("");
/* 705 */     txt_telefono21.setText("");
/* 706 */     txt_telefono22.setText("");
/* 707 */     txt_telefono23.setText("");
/*     */     
/* 709 */     txt_contacto3.setText("");
/* 710 */     txt_cargo3.setText("");
/* 711 */     txt_correo3.setText("");
/* 712 */     txt_celular3.setText("");
/* 713 */     txt_telefono31.setText("");
/* 714 */     txt_telefono32.setText("");
/* 715 */     txt_telefono33.setText("");
/*     */     
/* 717 */     txt_contacto4.setText("");
/* 718 */     txt_cargo4.setText("");
/* 719 */     txt_correo4.setText("");
/* 720 */     txt_celular4.setText("");
/* 721 */     txt_telefono41.setText("");
/* 722 */     txt_telefono42.setText("");
/* 723 */     txt_telefono43.setText("");
/*     */     
/* 725 */     txt_contactofac.setText("");
/* 726 */     txt_correofac.setText("");
/*     */     
/* 728 */     txt_nit.setBackground(Color.GRAY);
/* 729 */     txt_nombre_editar.setBackground(Color.GRAY);
/* 730 */     check_nit.setSelected(false);
/* 731 */     check_nombre.setSelected(false);
/* 732 */     check_nit.setEnabled(true);
/* 733 */     check_nombre.setEnabled(true);
/*     */   }
/*     */ }


/* Location:              C:\Users\David\Desktop\Programa_cliente\Programa\dist\Sistema de gestion de clientes.jar!\sistema_de_gestion_de_clientes_excel\panel_editar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */