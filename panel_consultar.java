/*     */ package sistema_de_gestion_de_clientes_excel;
/*     */ import com.codoid.products.fillo.Recordset;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JTextField;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ 
/*     */ public class panel_consultar extends JPanel {
/*     */   public static JButton boton_consultar;
/*     */   public static JButton boton_limpiar;
/*     */   public static JCheckBox check_nit;
/*     */   public static JCheckBox check_nombre;
/*     */   public static JMenu jMenu1;
/*     */   public static JMenu jMenu2;
/*     */   public static JMenuBar jMenuBar1;
/*     */   public static JLabel label_cargo1;
/*     */   public static JLabel label_cargo2;
/*     */   public static JLabel label_cargo3;
/*     */   public static JLabel label_cargo4;
/*     */   public static JLabel label_celular1;
/*     */   public static JLabel label_celular2;
/*     */   public static JLabel label_celular3;
/*     */   public static JLabel label_celular4;
/*     */   public static JLabel label_ciudad;
/*     */   public static JLabel label_contacto1;
/*     */   public static JLabel label_contacto2;
/*     */   public static JLabel label_contacto3;
/*  27 */   public String ruta2 = System.getProperty("user.dir"); public static JLabel label_contacto4; public static JLabel label_contactofac; public static JLabel label_correo1; public static JLabel label_correo2; public static JLabel label_correo3; public static JLabel label_correo4; public static JLabel label_correofac; public static JLabel label_direccion; public static JLabel label_fondo; public static JLabel label_razon; public static JLabel label_seleccione; public static JLabel label_telefono11; public static JLabel label_telefono12; public static JLabel label_telefono13; public static JLabel label_telefono21;
/*     */   public static JLabel label_telefono22;
/*     */   public static JLabel label_telefono23;
/*     */   public static JLabel label_telefono31;
/*     */   public static JLabel label_telefono32;
/*     */   
/*     */   public panel_consultar() {
/*  34 */     initComponents();
/*  35 */     items();
/*  36 */     txt_nit.setEditable(false);
/*  37 */     txt_nombre_consultar.setEditable(false);
/*  38 */     txt_nit.setBackground(Color.GRAY);
/*  39 */     txt_nombre_consultar.setBackground(Color.GRAY);
/*     */   }
/*     */   public static JLabel label_telefono33; public static JLabel label_telefono41; public static JLabel label_telefono42; public static JLabel label_telefono43; public static JTextField txt_cargo1; public static JTextField txt_cargo2; public static JTextField txt_cargo3; public static JTextField txt_cargo4; public static JTextField txt_celular1; public static JTextField txt_celular2; public static JTextField txt_celular3; public static JTextField txt_celular4; public static JTextField txt_ciudad; public static JTextField txt_contacto1; public static JTextField txt_contacto2;
/*     */   public static JTextField txt_contacto3;
/*     */   public static JTextField txt_contacto4;
/*     */   public static JTextField txt_contactofac;
/*     */   public static JTextField txt_correo1;
/*     */   
/*     */   public void items() {
/*  48 */     TextAutoCompleter textautocompleter = new TextAutoCompleter(txt_nombre_consultar);
/*     */ 
/*     */     
/*     */     try {
/*  52 */       Fillo fillo1c = new Fillo();
/*  53 */       String nit = txt_nit.getText().trim();
/*     */       
/*  55 */       Connection connection1c = fillo1c.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*  56 */       String strQuery1c = "Select distinct nombre from correos ";
/*  57 */       Recordset recordset1c = connection1c.executeQuery(strQuery1c);
/*     */       
/*  59 */       while (recordset1c.next()) {
/*  60 */         textautocompleter.addItem(recordset1c.getField("nombre"));
/*     */       }
/*     */ 
/*     */       
/*  64 */       recordset1c.close();
/*  65 */       connection1c.close();
/*     */     
/*     */     }
/*  68 */     catch (Exception e) {
/*  69 */       JOptionPane.showMessageDialog(null, "no hay conexion");
/*     */     } 
/*     */   }
/*     */   public static JTextField txt_correo2; public static JTextField txt_correo3; public static JTextField txt_correo4; public static JTextField txt_correofac; public static JTextField txt_direccion; public static JTextField txt_nit; public static JTextField txt_nombre_consultar; public static JTextField txt_razon; public static JTextField txt_telefono11; public static JTextField txt_telefono12;
/*     */   public static JTextField txt_telefono13;
/*     */   public static JTextField txt_telefono21;
/*     */   public static JTextField txt_telefono22;
/*     */   public static JTextField txt_telefono23;
/*     */   public static JTextField txt_telefono31;
/*     */   public static JTextField txt_telefono32;
/*     */   public static JTextField txt_telefono33;
/*     */   public static JTextField txt_telefono41;
/*     */   public static JTextField txt_telefono42;
/*     */   public static JTextField txt_telefono43;
/*     */   
/*     */   private void initComponents() {
/*  85 */     jMenuBar1 = new JMenuBar();
/*  86 */     jMenu1 = new JMenu();
/*  87 */     jMenu2 = new JMenu();
/*  88 */     label_seleccione = new JLabel();
/*  89 */     txt_nit = new JTextField();
/*  90 */     txt_nombre_consultar = new JTextField();
/*  91 */     boton_consultar = new JButton();
/*  92 */     boton_limpiar = new JButton();
/*  93 */     txt_razon = new JTextField();
/*  94 */     label_razon = new JLabel();
/*  95 */     label_ciudad = new JLabel();
/*  96 */     txt_ciudad = new JTextField();
/*  97 */     txt_direccion = new JTextField();
/*  98 */     label_direccion = new JLabel();
/*  99 */     txt_contacto1 = new JTextField();
/* 100 */     label_contacto1 = new JLabel();
/* 101 */     label_cargo1 = new JLabel();
/* 102 */     txt_cargo1 = new JTextField();
/* 103 */     label_correo1 = new JLabel();
/* 104 */     txt_correo1 = new JTextField();
/* 105 */     txt_celular1 = new JTextField();
/* 106 */     label_celular1 = new JLabel();
/* 107 */     label_telefono11 = new JLabel();
/* 108 */     txt_telefono11 = new JTextField();
/* 109 */     txt_telefono12 = new JTextField();
/* 110 */     label_telefono12 = new JLabel();
/* 111 */     txt_telefono13 = new JTextField();
/* 112 */     label_telefono13 = new JLabel();
/* 113 */     label_contacto2 = new JLabel();
/* 114 */     txt_contacto2 = new JTextField();
/* 115 */     label_cargo2 = new JLabel();
/* 116 */     txt_cargo2 = new JTextField();
/* 117 */     label_correo2 = new JLabel();
/* 118 */     txt_correo2 = new JTextField();
/* 119 */     label_celular2 = new JLabel();
/* 120 */     txt_celular2 = new JTextField();
/* 121 */     label_telefono21 = new JLabel();
/* 122 */     txt_telefono21 = new JTextField();
/* 123 */     txt_telefono22 = new JTextField();
/* 124 */     label_telefono22 = new JLabel();
/* 125 */     label_telefono23 = new JLabel();
/* 126 */     txt_telefono23 = new JTextField();
/* 127 */     label_contacto3 = new JLabel();
/* 128 */     txt_contacto3 = new JTextField();
/* 129 */     label_cargo3 = new JLabel();
/* 130 */     txt_cargo3 = new JTextField();
/* 131 */     label_correo3 = new JLabel();
/* 132 */     txt_correo3 = new JTextField();
/* 133 */     label_celular3 = new JLabel();
/* 134 */     txt_celular3 = new JTextField();
/* 135 */     label_telefono31 = new JLabel();
/* 136 */     txt_telefono31 = new JTextField();
/* 137 */     label_telefono32 = new JLabel();
/* 138 */     txt_telefono32 = new JTextField();
/* 139 */     label_telefono33 = new JLabel();
/* 140 */     txt_telefono33 = new JTextField();
/* 141 */     txt_celular4 = new JTextField();
/* 142 */     label_contacto4 = new JLabel();
/* 143 */     label_telefono43 = new JLabel();
/* 144 */     label_celular4 = new JLabel();
/* 145 */     label_telefono41 = new JLabel();
/* 146 */     txt_correo4 = new JTextField();
/* 147 */     txt_telefono43 = new JTextField();
/* 148 */     label_correo4 = new JLabel();
/* 149 */     txt_contacto4 = new JTextField();
/* 150 */     label_telefono42 = new JLabel();
/* 151 */     txt_telefono42 = new JTextField();
/* 152 */     txt_cargo4 = new JTextField();
/* 153 */     label_cargo4 = new JLabel();
/* 154 */     txt_telefono41 = new JTextField();
/* 155 */     label_contactofac = new JLabel();
/* 156 */     txt_contactofac = new JTextField();
/* 157 */     label_correofac = new JLabel();
/* 158 */     txt_correofac = new JTextField();
/* 159 */     check_nit = new JCheckBox();
/* 160 */     check_nombre = new JCheckBox();
/* 161 */     label_fondo = new JLabel();
/*     */     
/* 163 */     jMenu1.setText("File");
/* 164 */     jMenuBar1.add(jMenu1);
/*     */     
/* 166 */     jMenu2.setText("Edit");
/* 167 */     jMenuBar1.add(jMenu2);
/*     */     
/* 169 */     setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 171 */     label_seleccione.setFont(new Font("Tahoma", 0, 18));
/* 172 */     label_seleccione.setText("Seleccione un metodo de consulta");
/* 173 */     add(label_seleccione, new AbsoluteConstraints(10, 90, -1, -1));
/* 174 */     add(txt_nit, new AbsoluteConstraints(10, 170, 96, -1));
/* 175 */     add(txt_nombre_consultar, new AbsoluteConstraints(130, 170, 251, -1));
/*     */     
/* 177 */     boton_consultar.setBackground(new Color(255, 255, 255));
/* 178 */     boton_consultar.setIcon(new ImageIcon(getClass().getResource("/images/buscar64.png")));
/* 179 */     boton_consultar.setBorder((Border)null);
/* 180 */     boton_consultar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 182 */             panel_consultar.this.boton_consultarActionPerformed(evt);
/*     */           }
/*     */         });
/* 185 */     add(boton_consultar, new AbsoluteConstraints(440, 120, 80, 80));
/*     */     
/* 187 */     boton_limpiar.setBackground(new Color(255, 255, 255));
/* 188 */     boton_limpiar.setIcon(new ImageIcon(getClass().getResource("/images/limpiar64.png")));
/* 189 */     boton_limpiar.setBorder((Border)null);
/* 190 */     boton_limpiar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 192 */             panel_consultar.this.boton_limpiarActionPerformed(evt);
/*     */           }
/*     */         });
/* 195 */     add(boton_limpiar, new AbsoluteConstraints(540, 120, 80, 80));
/*     */     
/* 197 */     txt_razon.setEditable(false);
/* 198 */     txt_razon.setBackground(new Color(255, 255, 255));
/* 199 */     add(txt_razon, new AbsoluteConstraints(10, 260, 412, -1));
/*     */     
/* 201 */     label_razon.setText("Razon social");
/* 202 */     add(label_razon, new AbsoluteConstraints(10, 240, -1, -1));
/*     */     
/* 204 */     label_ciudad.setText("Ciudad");
/* 205 */     add(label_ciudad, new AbsoluteConstraints(440, 240, -1, -1));
/*     */     
/* 207 */     txt_ciudad.setEditable(false);
/* 208 */     txt_ciudad.setBackground(new Color(255, 255, 255));
/* 209 */     add(txt_ciudad, new AbsoluteConstraints(440, 260, 197, -1));
/*     */     
/* 211 */     txt_direccion.setEditable(false);
/* 212 */     txt_direccion.setBackground(new Color(255, 255, 255));
/* 213 */     add(txt_direccion, new AbsoluteConstraints(660, 260, 434, -1));
/*     */     
/* 215 */     label_direccion.setText("Dirección");
/* 216 */     add(label_direccion, new AbsoluteConstraints(660, 240, -1, -1));
/*     */     
/* 218 */     txt_contacto1.setEditable(false);
/* 219 */     txt_contacto1.setBackground(new Color(255, 255, 255));
/* 220 */     add(txt_contacto1, new AbsoluteConstraints(10, 320, 197, -1));
/*     */     
/* 222 */     label_contacto1.setText("Contacto 1");
/* 223 */     add(label_contacto1, new AbsoluteConstraints(10, 300, -1, -1));
/*     */     
/* 225 */     label_cargo1.setText("Cargo");
/* 226 */     add(label_cargo1, new AbsoluteConstraints(230, 300, -1, -1));
/*     */     
/* 228 */     txt_cargo1.setEditable(false);
/* 229 */     txt_cargo1.setBackground(new Color(255, 255, 255));
/* 230 */     add(txt_cargo1, new AbsoluteConstraints(230, 320, 197, -1));
/*     */     
/* 232 */     label_correo1.setText("Correo");
/* 233 */     add(label_correo1, new AbsoluteConstraints(440, 300, -1, -1));
/*     */     
/* 235 */     txt_correo1.setEditable(false);
/* 236 */     txt_correo1.setBackground(new Color(255, 255, 255));
/* 237 */     add(txt_correo1, new AbsoluteConstraints(440, 320, 197, -1));
/*     */     
/* 239 */     txt_celular1.setEditable(false);
/* 240 */     txt_celular1.setBackground(new Color(255, 255, 255));
/* 241 */     add(txt_celular1, new AbsoluteConstraints(660, 320, 95, -1));
/*     */     
/* 243 */     label_celular1.setText("Celular");
/* 244 */     add(label_celular1, new AbsoluteConstraints(660, 300, -1, -1));
/*     */     
/* 246 */     label_telefono11.setText("Telefono 1");
/* 247 */     add(label_telefono11, new AbsoluteConstraints(770, 300, -1, -1));
/*     */     
/* 249 */     txt_telefono11.setEditable(false);
/* 250 */     txt_telefono11.setBackground(new Color(255, 255, 255));
/* 251 */     add(txt_telefono11, new AbsoluteConstraints(770, 320, 95, -1));
/*     */     
/* 253 */     txt_telefono12.setEditable(false);
/* 254 */     txt_telefono12.setBackground(new Color(255, 255, 255));
/* 255 */     add(txt_telefono12, new AbsoluteConstraints(880, 320, 95, -1));
/*     */     
/* 257 */     label_telefono12.setText("Telefono 2");
/* 258 */     add(label_telefono12, new AbsoluteConstraints(880, 300, -1, -1));
/*     */     
/* 260 */     txt_telefono13.setEditable(false);
/* 261 */     txt_telefono13.setBackground(new Color(255, 255, 255));
/* 262 */     add(txt_telefono13, new AbsoluteConstraints(990, 320, 95, -1));
/*     */     
/* 264 */     label_telefono13.setText("Telefono 3");
/* 265 */     add(label_telefono13, new AbsoluteConstraints(990, 300, -1, -1));
/*     */     
/* 267 */     label_contacto2.setText("Contacto 2");
/* 268 */     add(label_contacto2, new AbsoluteConstraints(10, 370, -1, -1));
/*     */     
/* 270 */     txt_contacto2.setEditable(false);
/* 271 */     txt_contacto2.setBackground(new Color(255, 255, 255));
/* 272 */     add(txt_contacto2, new AbsoluteConstraints(10, 400, 197, -1));
/*     */     
/* 274 */     label_cargo2.setText("Cargo");
/* 275 */     add(label_cargo2, new AbsoluteConstraints(230, 370, -1, -1));
/*     */     
/* 277 */     txt_cargo2.setEditable(false);
/* 278 */     txt_cargo2.setBackground(new Color(255, 255, 255));
/* 279 */     add(txt_cargo2, new AbsoluteConstraints(230, 400, 197, -1));
/*     */     
/* 281 */     label_correo2.setText("Correo");
/* 282 */     add(label_correo2, new AbsoluteConstraints(440, 370, -1, -1));
/*     */     
/* 284 */     txt_correo2.setEditable(false);
/* 285 */     txt_correo2.setBackground(new Color(255, 255, 255));
/* 286 */     add(txt_correo2, new AbsoluteConstraints(440, 400, 197, -1));
/*     */     
/* 288 */     label_celular2.setText("Celular");
/* 289 */     add(label_celular2, new AbsoluteConstraints(660, 370, -1, -1));
/*     */     
/* 291 */     txt_celular2.setEditable(false);
/* 292 */     txt_celular2.setBackground(new Color(255, 255, 255));
/* 293 */     add(txt_celular2, new AbsoluteConstraints(660, 400, 95, -1));
/*     */     
/* 295 */     label_telefono21.setText("Telefono 1");
/* 296 */     add(label_telefono21, new AbsoluteConstraints(770, 370, -1, -1));
/*     */     
/* 298 */     txt_telefono21.setEditable(false);
/* 299 */     txt_telefono21.setBackground(new Color(255, 255, 255));
/* 300 */     add(txt_telefono21, new AbsoluteConstraints(770, 400, 95, -1));
/*     */     
/* 302 */     txt_telefono22.setEditable(false);
/* 303 */     txt_telefono22.setBackground(new Color(255, 255, 255));
/* 304 */     add(txt_telefono22, new AbsoluteConstraints(880, 400, 95, -1));
/*     */     
/* 306 */     label_telefono22.setText("Telefono 2");
/* 307 */     add(label_telefono22, new AbsoluteConstraints(880, 370, -1, -1));
/*     */     
/* 309 */     label_telefono23.setText("Telefono 3");
/* 310 */     add(label_telefono23, new AbsoluteConstraints(990, 370, -1, -1));
/*     */     
/* 312 */     txt_telefono23.setEditable(false);
/* 313 */     txt_telefono23.setBackground(new Color(255, 255, 255));
/* 314 */     add(txt_telefono23, new AbsoluteConstraints(990, 400, 95, -1));
/*     */     
/* 316 */     label_contacto3.setText("Contacto 3");
/* 317 */     add(label_contacto3, new AbsoluteConstraints(10, 450, -1, -1));
/*     */     
/* 319 */     txt_contacto3.setEditable(false);
/* 320 */     txt_contacto3.setBackground(new Color(255, 255, 255));
/* 321 */     add(txt_contacto3, new AbsoluteConstraints(10, 470, 197, -1));
/*     */     
/* 323 */     label_cargo3.setText("Cargo");
/* 324 */     add(label_cargo3, new AbsoluteConstraints(230, 450, -1, -1));
/*     */     
/* 326 */     txt_cargo3.setEditable(false);
/* 327 */     txt_cargo3.setBackground(new Color(255, 255, 255));
/* 328 */     add(txt_cargo3, new AbsoluteConstraints(230, 470, 197, -1));
/*     */     
/* 330 */     label_correo3.setText("Correo");
/* 331 */     add(label_correo3, new AbsoluteConstraints(440, 450, -1, -1));
/*     */     
/* 333 */     txt_correo3.setEditable(false);
/* 334 */     txt_correo3.setBackground(new Color(255, 255, 255));
/* 335 */     add(txt_correo3, new AbsoluteConstraints(440, 470, 197, -1));
/*     */     
/* 337 */     label_celular3.setText("Celular");
/* 338 */     add(label_celular3, new AbsoluteConstraints(660, 450, -1, -1));
/*     */     
/* 340 */     txt_celular3.setEditable(false);
/* 341 */     txt_celular3.setBackground(new Color(255, 255, 255));
/* 342 */     add(txt_celular3, new AbsoluteConstraints(660, 470, 95, -1));
/*     */     
/* 344 */     label_telefono31.setText("Telefono 1");
/* 345 */     add(label_telefono31, new AbsoluteConstraints(770, 450, -1, -1));
/*     */     
/* 347 */     txt_telefono31.setEditable(false);
/* 348 */     txt_telefono31.setBackground(new Color(255, 255, 255));
/* 349 */     add(txt_telefono31, new AbsoluteConstraints(770, 470, 95, -1));
/*     */     
/* 351 */     label_telefono32.setText("Telefono 2");
/* 352 */     add(label_telefono32, new AbsoluteConstraints(880, 450, -1, -1));
/*     */     
/* 354 */     txt_telefono32.setEditable(false);
/* 355 */     txt_telefono32.setBackground(new Color(255, 255, 255));
/* 356 */     add(txt_telefono32, new AbsoluteConstraints(880, 470, 95, -1));
/*     */     
/* 358 */     label_telefono33.setText("Telefono 3");
/* 359 */     add(label_telefono33, new AbsoluteConstraints(990, 450, -1, -1));
/*     */     
/* 361 */     txt_telefono33.setEditable(false);
/* 362 */     txt_telefono33.setBackground(new Color(255, 255, 255));
/* 363 */     add(txt_telefono33, new AbsoluteConstraints(990, 470, 95, -1));
/*     */     
/* 365 */     txt_celular4.setEditable(false);
/* 366 */     txt_celular4.setBackground(new Color(255, 255, 255));
/* 367 */     add(txt_celular4, new AbsoluteConstraints(660, 550, 95, -1));
/*     */     
/* 369 */     label_contacto4.setText("Contacto 4");
/* 370 */     add(label_contacto4, new AbsoluteConstraints(10, 520, -1, -1));
/*     */     
/* 372 */     label_telefono43.setText("Telefono 3");
/* 373 */     add(label_telefono43, new AbsoluteConstraints(990, 520, -1, -1));
/*     */     
/* 375 */     label_celular4.setText("Celular");
/* 376 */     add(label_celular4, new AbsoluteConstraints(660, 520, -1, -1));
/*     */     
/* 378 */     label_telefono41.setText("Telefono 1");
/* 379 */     add(label_telefono41, new AbsoluteConstraints(770, 520, -1, -1));
/*     */     
/* 381 */     txt_correo4.setEditable(false);
/* 382 */     txt_correo4.setBackground(new Color(255, 255, 255));
/* 383 */     add(txt_correo4, new AbsoluteConstraints(440, 550, 197, -1));
/*     */     
/* 385 */     txt_telefono43.setEditable(false);
/* 386 */     txt_telefono43.setBackground(new Color(255, 255, 255));
/* 387 */     add(txt_telefono43, new AbsoluteConstraints(990, 550, 95, -1));
/*     */     
/* 389 */     label_correo4.setText("Correo");
/* 390 */     add(label_correo4, new AbsoluteConstraints(440, 520, -1, -1));
/*     */     
/* 392 */     txt_contacto4.setEditable(false);
/* 393 */     txt_contacto4.setBackground(new Color(255, 255, 255));
/* 394 */     add(txt_contacto4, new AbsoluteConstraints(10, 550, 197, -1));
/*     */     
/* 396 */     label_telefono42.setText("Telefono 2");
/* 397 */     add(label_telefono42, new AbsoluteConstraints(880, 520, -1, -1));
/*     */     
/* 399 */     txt_telefono42.setEditable(false);
/* 400 */     txt_telefono42.setBackground(new Color(255, 255, 255));
/* 401 */     add(txt_telefono42, new AbsoluteConstraints(880, 550, 95, -1));
/*     */     
/* 403 */     txt_cargo4.setEditable(false);
/* 404 */     txt_cargo4.setBackground(new Color(255, 255, 255));
/* 405 */     add(txt_cargo4, new AbsoluteConstraints(230, 550, 197, -1));
/*     */     
/* 407 */     label_cargo4.setText("Cargo");
/* 408 */     add(label_cargo4, new AbsoluteConstraints(230, 520, -1, -1));
/*     */     
/* 410 */     txt_telefono41.setEditable(false);
/* 411 */     txt_telefono41.setBackground(new Color(255, 255, 255));
/* 412 */     add(txt_telefono41, new AbsoluteConstraints(770, 550, 95, -1));
/*     */     
/* 414 */     label_contactofac.setText("Contacto facturación");
/* 415 */     add(label_contactofac, new AbsoluteConstraints(10, 600, -1, -1));
/*     */     
/* 417 */     txt_contactofac.setEditable(false);
/* 418 */     txt_contactofac.setBackground(new Color(255, 255, 255));
/* 419 */     add(txt_contactofac, new AbsoluteConstraints(10, 620, 197, -1));
/*     */     
/* 421 */     label_correofac.setText("Correo facturación");
/* 422 */     add(label_correofac, new AbsoluteConstraints(230, 600, -1, -1));
/*     */     
/* 424 */     txt_correofac.setEditable(false);
/* 425 */     txt_correofac.setBackground(new Color(255, 255, 255));
/* 426 */     add(txt_correofac, new AbsoluteConstraints(230, 620, 197, -1));
/*     */     
/* 428 */     check_nit.setBackground(new Color(255, 255, 255));
/* 429 */     check_nit.setText("Nit");
/* 430 */     check_nit.addItemListener(new ItemListener() {
/*     */           public void itemStateChanged(ItemEvent evt) {
/* 432 */             panel_consultar.this.check_nitItemStateChanged(evt);
/*     */           }
/*     */         });
/* 435 */     add(check_nit, new AbsoluteConstraints(10, 140, -1, -1));
/*     */     
/* 437 */     check_nombre.setBackground(new Color(255, 255, 255));
/* 438 */     check_nombre.setText("Nombre");
/* 439 */     check_nombre.addItemListener(new ItemListener() {
/*     */           public void itemStateChanged(ItemEvent evt) {
/* 441 */             panel_consultar.this.check_nombreItemStateChanged(evt);
/*     */           }
/*     */         });
/* 444 */     add(check_nombre, new AbsoluteConstraints(130, 140, -1, -1));
/* 445 */     add(label_fondo, new AbsoluteConstraints(0, 0, 1360, 710));
/*     */   }
/*     */ 
/*     */   
/*     */   private void boton_consultarActionPerformed(ActionEvent evt) {
/* 450 */     if (check_nit.isSelected() == true && !check_nombre.isSelected()) {
/*     */       
/*     */       try {
/* 453 */         Fillo fillo2c = new Fillo();
/* 454 */         String nit = txt_nit.getText().trim();
/*     */         
/* 456 */         Connection connection2c = fillo2c.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 457 */         String strQuery2c = "Select * from correos where nit=" + nit;
/* 458 */         Recordset recordset2c = connection2c.executeQuery(strQuery2c);
/*     */         
/* 460 */         while (recordset2c.next()) {
/*     */ 
/*     */           
/* 463 */           txt_nombre_consultar.setText(recordset2c.getField("nombre"));
/* 464 */           txt_razon.setText(recordset2c.getField("razonsocial"));
/* 465 */           txt_ciudad.setText(recordset2c.getField("ciudad"));
/* 466 */           txt_direccion.setText(recordset2c.getField("direccion"));
/*     */ 
/*     */           
/* 469 */           txt_contacto1.setText(recordset2c.getField("contacto1"));
/* 470 */           txt_cargo1.setText(recordset2c.getField("cargo1"));
/* 471 */           txt_celular1.setText(recordset2c.getField("celular1"));
/* 472 */           txt_correo1.setText(recordset2c.getField("correo1"));
/* 473 */           txt_telefono11.setText(recordset2c.getField("telefono11"));
/* 474 */           txt_telefono12.setText(recordset2c.getField("telefono12"));
/* 475 */           txt_telefono13.setText(recordset2c.getField("telefono13"));
/*     */ 
/*     */           
/* 478 */           txt_contacto2.setText(recordset2c.getField("contacto2"));
/* 479 */           txt_cargo2.setText(recordset2c.getField("cargo2"));
/* 480 */           txt_celular2.setText(recordset2c.getField("celular2"));
/* 481 */           txt_correo2.setText(recordset2c.getField("correo2"));
/* 482 */           txt_telefono21.setText(recordset2c.getField("telefono21"));
/* 483 */           txt_telefono22.setText(recordset2c.getField("telefono22"));
/* 484 */           txt_telefono23.setText(recordset2c.getField("telefono23"));
/*     */ 
/*     */           
/* 487 */           txt_contacto3.setText(recordset2c.getField("contacto3"));
/* 488 */           txt_cargo3.setText(recordset2c.getField("cargo3"));
/* 489 */           txt_celular3.setText(recordset2c.getField("celular3"));
/* 490 */           txt_correo3.setText(recordset2c.getField("correo3"));
/* 491 */           txt_telefono31.setText(recordset2c.getField("telefono31"));
/* 492 */           txt_telefono32.setText(recordset2c.getField("telefono32"));
/* 493 */           txt_telefono33.setText(recordset2c.getField("telefono33"));
/*     */ 
/*     */           
/* 496 */           txt_contacto4.setText(recordset2c.getField("contacto4"));
/* 497 */           txt_cargo4.setText(recordset2c.getField("cargo4"));
/* 498 */           txt_celular4.setText(recordset2c.getField("celular4"));
/* 499 */           txt_correo4.setText(recordset2c.getField("correo4"));
/* 500 */           txt_telefono41.setText(recordset2c.getField("telefono41"));
/* 501 */           txt_telefono42.setText(recordset2c.getField("telefono42"));
/* 502 */           txt_telefono43.setText(recordset2c.getField("telefono43"));
/*     */           
/* 504 */           txt_contactofac.setText(recordset2c.getField("contactofac"));
/* 505 */           txt_correofac.setText(recordset2c.getField("correofac"));
/*     */         } 
/* 507 */         recordset2c.close();
/* 508 */         connection2c.close();
/*     */       
/*     */       }
/* 511 */       catch (Exception e) {
/*     */         
/* 513 */         JOptionPane.showMessageDialog(null, "La empresa con NIT " + txt_nit.getText().trim() + " no ha sido registrada");
/*     */       } 
/*     */     }
/*     */ 
/*     */     
/* 518 */     if (check_nombre.isSelected() == true && !check_nit.isSelected()) {
/*     */       
/*     */       try {
/* 521 */         Fillo fillo3c = new Fillo();
/* 522 */         String nombre = txt_nombre_consultar.getText().trim();
/*     */         
/* 524 */         Connection connection3c = fillo3c.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 525 */         String strQuery3c = "Select * from correos where nombre='" + nombre + "'";
/* 526 */         Recordset recordset3c = connection3c.executeQuery(strQuery3c);
/*     */         
/* 528 */         while (recordset3c.next()) {
/*     */ 
/*     */           
/* 531 */           txt_nit.setText(recordset3c.getField("nit"));
/* 532 */           txt_razon.setText(recordset3c.getField("razonsocial"));
/* 533 */           txt_ciudad.setText(recordset3c.getField("ciudad"));
/* 534 */           txt_direccion.setText(recordset3c.getField("direccion"));
/*     */ 
/*     */           
/* 537 */           txt_contacto1.setText(recordset3c.getField("contacto1"));
/* 538 */           txt_cargo1.setText(recordset3c.getField("cargo1"));
/* 539 */           txt_celular1.setText(recordset3c.getField("celular1"));
/* 540 */           txt_correo1.setText(recordset3c.getField("correo1"));
/* 541 */           txt_telefono11.setText(recordset3c.getField("telefono11"));
/* 542 */           txt_telefono12.setText(recordset3c.getField("telefono12"));
/* 543 */           txt_telefono13.setText(recordset3c.getField("telefono13"));
/*     */ 
/*     */           
/* 546 */           txt_contacto2.setText(recordset3c.getField("contacto2"));
/* 547 */           txt_cargo2.setText(recordset3c.getField("cargo2"));
/* 548 */           txt_celular2.setText(recordset3c.getField("celular2"));
/* 549 */           txt_correo2.setText(recordset3c.getField("correo2"));
/* 550 */           txt_telefono21.setText(recordset3c.getField("telefono21"));
/* 551 */           txt_telefono22.setText(recordset3c.getField("telefono22"));
/* 552 */           txt_telefono23.setText(recordset3c.getField("telefono23"));
/*     */ 
/*     */           
/* 555 */           txt_contacto3.setText(recordset3c.getField("contacto3"));
/* 556 */           txt_cargo3.setText(recordset3c.getField("cargo3"));
/* 557 */           txt_celular3.setText(recordset3c.getField("celular3"));
/* 558 */           txt_correo3.setText(recordset3c.getField("correo3"));
/* 559 */           txt_telefono31.setText(recordset3c.getField("telefono31"));
/* 560 */           txt_telefono32.setText(recordset3c.getField("telefono32"));
/* 561 */           txt_telefono33.setText(recordset3c.getField("telefono33"));
/*     */ 
/*     */           
/* 564 */           txt_contacto4.setText(recordset3c.getField("contacto4"));
/* 565 */           txt_cargo4.setText(recordset3c.getField("cargo4"));
/* 566 */           txt_celular4.setText(recordset3c.getField("celular4"));
/* 567 */           txt_correo4.setText(recordset3c.getField("correo4"));
/* 568 */           txt_telefono41.setText(recordset3c.getField("telefono41"));
/* 569 */           txt_telefono42.setText(recordset3c.getField("telefono42"));
/* 570 */           txt_telefono43.setText(recordset3c.getField("telefono43"));
/*     */           
/* 572 */           txt_contactofac.setText(recordset3c.getField("contactofac"));
/* 573 */           txt_correofac.setText(recordset3c.getField("correofac"));
/*     */         } 
/*     */         
/* 576 */         recordset3c.close();
/* 577 */         connection3c.close();
/*     */       }
/* 579 */       catch (Exception e) {
/*     */         
/* 581 */         JOptionPane.showMessageDialog(null, "La empresa " + txt_nombre_consultar.getText().trim() + " no ha sido registrada");
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 588 */     if (!check_nombre.isSelected() && !check_nit.isSelected())
/*     */     {
/* 590 */       JOptionPane.showMessageDialog(null, "Seleccione un metodo de busqueda");
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void boton_limpiarActionPerformed(ActionEvent evt) {
/* 597 */     txt_nit.setText((String)null);
/* 598 */     txt_nombre_consultar.setText((String)null);
/* 599 */     txt_razon.setText((String)null);
/* 600 */     txt_ciudad.setText((String)null);
/* 601 */     txt_direccion.setText((String)null);
/*     */ 
/*     */     
/* 604 */     txt_contacto1.setText((String)null);
/* 605 */     txt_cargo1.setText((String)null);
/* 606 */     txt_celular1.setText((String)null);
/* 607 */     txt_correo1.setText((String)null);
/* 608 */     txt_telefono11.setText((String)null);
/* 609 */     txt_telefono12.setText((String)null);
/* 610 */     txt_telefono13.setText((String)null);
/*     */ 
/*     */     
/* 613 */     txt_contacto2.setText((String)null);
/* 614 */     txt_cargo2.setText((String)null);
/* 615 */     txt_celular2.setText((String)null);
/* 616 */     txt_correo2.setText((String)null);
/* 617 */     txt_telefono21.setText((String)null);
/* 618 */     txt_telefono22.setText((String)null);
/* 619 */     txt_telefono23.setText((String)null);
/*     */ 
/*     */     
/* 622 */     txt_contacto3.setText((String)null);
/* 623 */     txt_cargo3.setText((String)null);
/* 624 */     txt_celular3.setText((String)null);
/* 625 */     txt_correo3.setText((String)null);
/* 626 */     txt_telefono31.setText((String)null);
/* 627 */     txt_telefono32.setText((String)null);
/* 628 */     txt_telefono33.setText((String)null);
/*     */ 
/*     */     
/* 631 */     txt_contacto4.setText((String)null);
/* 632 */     txt_cargo4.setText((String)null);
/* 633 */     txt_celular4.setText((String)null);
/* 634 */     txt_correo4.setText((String)null);
/* 635 */     txt_telefono41.setText((String)null);
/* 636 */     txt_telefono42.setText((String)null);
/* 637 */     txt_telefono43.setText((String)null);
/*     */ 
/*     */     
/* 640 */     txt_contactofac.setText((String)null);
/* 641 */     txt_correofac.setText((String)null);
/*     */ 
/*     */ 
/*     */     
/* 645 */     check_nit.setSelected(false);
/* 646 */     check_nombre.setSelected(false);
/* 647 */     check_nit.setEnabled(true);
/* 648 */     check_nombre.setEnabled(true);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nitItemStateChanged(ItemEvent evt) {
/* 655 */     if (check_nit.isSelected() == true) {
/* 656 */       txt_nit.setEditable(true);
/* 657 */       txt_nit.setBackground(Color.WHITE);
/* 658 */       check_nombre.setEnabled(false);
/* 659 */       txt_nombre_consultar.setEditable(false);
/*     */     } else {
/* 661 */       txt_nit.setEditable(false);
/* 662 */       txt_nit.setBackground(Color.GRAY);
/* 663 */       check_nombre.setEnabled(true);
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void check_nombreItemStateChanged(ItemEvent evt) {
/* 671 */     if (check_nombre.isSelected() == true) {
/* 672 */       txt_nombre_consultar.setEditable(true);
/* 673 */       txt_nombre_consultar.setBackground(Color.WHITE);
/* 674 */       check_nit.setEnabled(false);
/* 675 */       txt_nit.setEditable(false);
/*     */     } else {
/* 677 */       txt_nombre_consultar.setEditable(false);
/* 678 */       txt_nombre_consultar.setBackground(Color.GRAY);
/* 679 */       check_nit.setEnabled(true);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\David\Desktop\Programa_cliente\Programa\dist\Sistema de gestion de clientes.jar!\sistema_de_gestion_de_clientes_excel\panel_consultar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */