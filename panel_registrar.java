/*     */ package sistema_de_gestion_de_clientes_excel;
/*     */ 
/*     */ import com.codoid.products.fillo.Connection;
/*     */ import com.codoid.products.fillo.Fillo;
/*     */ import com.codoid.products.fillo.Recordset;
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import javax.swing.ImageIcon;
/*     */ import javax.swing.JButton;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.JTextField;
/*     */ import javax.swing.border.Border;
/*     */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*     */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*     */ 
/*     */ public class panel_registrar
/*     */   extends JPanel {
/*     */   public int yes_no;
/*     */   public int yes_no2;
/*     */   public int yes_no3;
/*     */   public int validacion;
/*     */   public int condicion;
/*  29 */   public String prueba = ""; public static JButton boton_limpiar; public static JButton boton_registrar; public static JLabel label_cargo1; public static JLabel label_cargo2; public static JLabel label_cargo3; public static JLabel label_cargo4; public static JLabel label_celular1; public static JLabel label_celular2; public static JLabel label_celular3; public static JLabel label_celular4; public static JLabel label_ciudad; public static JLabel label_contacto1; public static JLabel label_contacto2; public static JLabel label_contacto3; public static JLabel label_contacto4; public static JLabel label_contactofac; public static JLabel label_correo1; public static JLabel label_correo2; public static JLabel label_correo3;
/*  30 */   public String ruta2 = System.getProperty("user.dir"); public static JLabel label_correo4; public static JLabel label_correofac; public static JLabel label_direccion; public static JLabel label_fondo; public static JLabel label_nit; public static JLabel label_nombre; public static JLabel label_razon; public static JLabel label_seleccione; public static JLabel label_telefono11; public static JLabel label_telefono12; public static JLabel label_telefono13; public static JLabel label_telefono21; public static JLabel label_telefono22; public static JLabel label_telefono23;
/*     */   public static JLabel label_telefono31;
/*     */   public static JLabel label_telefono32;
/*     */   public static JLabel label_telefono33;
/*     */   public static JLabel label_telefono41;
/*     */   
/*     */   public panel_registrar() {
/*  37 */     initComponents();
/*     */   }
/*     */   public static JLabel label_telefono42; public static JLabel label_telefono43; public static JTextField txt_cargo1; public static JTextField txt_cargo2; public static JTextField txt_cargo3; public static JTextField txt_cargo4; public static JTextField txt_celular1; public static JTextField txt_celular2; public static JTextField txt_celular3; public static JTextField txt_celular4; public static JTextField txt_ciudad; public static JTextField txt_contacto1; public static JTextField txt_contacto2; public static JTextField txt_contacto3; public static JTextField txt_contacto4; public static JTextField txt_contactofac; public static JTextField txt_correo1; public static JTextField txt_correo2; public static JTextField txt_correo3; public static JTextField txt_correo4; public static JTextField txt_correofac; public static JTextField txt_direccion; public static JTextField txt_nit; public static JTextField txt_nombre; public static JTextField txt_razon;
/*     */   public static JTextField txt_telefono11;
/*     */   public static JTextField txt_telefono12;
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
/*  54 */     label_seleccione = new JLabel();
/*  55 */     txt_nit = new JTextField();
/*  56 */     txt_nombre = new JTextField();
/*  57 */     boton_limpiar = new JButton();
/*  58 */     txt_razon = new JTextField();
/*  59 */     label_razon = new JLabel();
/*  60 */     label_ciudad = new JLabel();
/*  61 */     txt_ciudad = new JTextField();
/*  62 */     txt_direccion = new JTextField();
/*  63 */     label_direccion = new JLabel();
/*  64 */     txt_contacto1 = new JTextField();
/*  65 */     label_contacto1 = new JLabel();
/*  66 */     label_cargo1 = new JLabel();
/*  67 */     txt_cargo1 = new JTextField();
/*  68 */     label_correo1 = new JLabel();
/*  69 */     txt_correo1 = new JTextField();
/*  70 */     txt_celular1 = new JTextField();
/*  71 */     label_celular1 = new JLabel();
/*  72 */     label_telefono11 = new JLabel();
/*  73 */     txt_telefono11 = new JTextField();
/*  74 */     txt_telefono12 = new JTextField();
/*  75 */     label_telefono12 = new JLabel();
/*  76 */     txt_telefono13 = new JTextField();
/*  77 */     label_telefono13 = new JLabel();
/*  78 */     label_contacto2 = new JLabel();
/*  79 */     txt_contacto2 = new JTextField();
/*  80 */     label_cargo2 = new JLabel();
/*  81 */     txt_cargo2 = new JTextField();
/*  82 */     label_correo2 = new JLabel();
/*  83 */     txt_correo2 = new JTextField();
/*  84 */     label_celular2 = new JLabel();
/*  85 */     txt_celular2 = new JTextField();
/*  86 */     label_telefono21 = new JLabel();
/*  87 */     txt_telefono21 = new JTextField();
/*  88 */     txt_telefono22 = new JTextField();
/*  89 */     label_telefono22 = new JLabel();
/*  90 */     label_telefono23 = new JLabel();
/*  91 */     txt_telefono23 = new JTextField();
/*  92 */     label_contacto3 = new JLabel();
/*  93 */     txt_contacto3 = new JTextField();
/*  94 */     label_cargo3 = new JLabel();
/*  95 */     txt_cargo3 = new JTextField();
/*  96 */     label_correo3 = new JLabel();
/*  97 */     txt_correo3 = new JTextField();
/*  98 */     label_celular3 = new JLabel();
/*  99 */     txt_celular3 = new JTextField();
/* 100 */     label_telefono31 = new JLabel();
/* 101 */     txt_telefono31 = new JTextField();
/* 102 */     label_telefono32 = new JLabel();
/* 103 */     txt_telefono32 = new JTextField();
/* 104 */     label_telefono33 = new JLabel();
/* 105 */     txt_telefono33 = new JTextField();
/* 106 */     txt_celular4 = new JTextField();
/* 107 */     label_contactofac = new JLabel();
/* 108 */     label_telefono43 = new JLabel();
/* 109 */     label_celular4 = new JLabel();
/* 110 */     label_telefono41 = new JLabel();
/* 111 */     txt_correo4 = new JTextField();
/* 112 */     txt_telefono43 = new JTextField();
/* 113 */     label_correo4 = new JLabel();
/* 114 */     txt_contactofac = new JTextField();
/* 115 */     label_telefono42 = new JLabel();
/* 116 */     txt_telefono42 = new JTextField();
/* 117 */     txt_correofac = new JTextField();
/* 118 */     label_cargo4 = new JLabel();
/* 119 */     txt_telefono41 = new JTextField();
/* 120 */     boton_registrar = new JButton();
/* 121 */     label_nit = new JLabel();
/* 122 */     label_nombre = new JLabel();
/* 123 */     label_contacto4 = new JLabel();
/* 124 */     txt_contacto4 = new JTextField();
/* 125 */     label_correofac = new JLabel();
/* 126 */     txt_cargo4 = new JTextField();
/* 127 */     label_fondo = new JLabel();
/*     */     
/* 129 */     setBackground(new Color(255, 255, 255));
/* 130 */     setPreferredSize(new Dimension(1360, 710));
/* 131 */     setLayout((LayoutManager)new AbsoluteLayout());
/*     */     
/* 133 */     label_seleccione.setFont(new Font("Tahoma", 0, 18));
/* 134 */     label_seleccione.setText("Registro de clientes");
/* 135 */     add(label_seleccione, new AbsoluteConstraints(20, 80, -1, -1));
/* 136 */     add(txt_nit, new AbsoluteConstraints(20, 160, 96, -1));
/* 137 */     add(txt_nombre, new AbsoluteConstraints(130, 160, 251, -1));
/*     */     
/* 139 */     boton_limpiar.setBackground(new Color(255, 255, 255));
/* 140 */     boton_limpiar.setIcon(new ImageIcon(getClass().getResource("/images/limpiar64.png")));
/* 141 */     boton_limpiar.setBorder((Border)null);
/* 142 */     boton_limpiar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 144 */             panel_registrar.this.boton_limpiarActionPerformed(evt);
/*     */           }
/*     */         });
/* 147 */     add(boton_limpiar, new AbsoluteConstraints(540, 110, 80, 80));
/* 148 */     add(txt_razon, new AbsoluteConstraints(20, 260, 412, -1));
/*     */     
/* 150 */     label_razon.setText("Razon social");
/* 151 */     add(label_razon, new AbsoluteConstraints(20, 240, -1, -1));
/*     */     
/* 153 */     label_ciudad.setText("Ciudad");
/* 154 */     add(label_ciudad, new AbsoluteConstraints(450, 240, -1, -1));
/* 155 */     add(txt_ciudad, new AbsoluteConstraints(450, 260, 197, -1));
/* 156 */     add(txt_direccion, new AbsoluteConstraints(670, 260, 434, -1));
/*     */     
/* 158 */     label_direccion.setText("Dirección");
/* 159 */     add(label_direccion, new AbsoluteConstraints(670, 240, -1, -1));
/* 160 */     add(txt_contacto1, new AbsoluteConstraints(20, 330, 197, -1));
/*     */     
/* 162 */     label_contacto1.setText("Contacto 1");
/* 163 */     add(label_contacto1, new AbsoluteConstraints(20, 310, -1, -1));
/*     */     
/* 165 */     label_cargo1.setText("Cargo");
/* 166 */     add(label_cargo1, new AbsoluteConstraints(240, 310, -1, -1));
/* 167 */     add(txt_cargo1, new AbsoluteConstraints(240, 330, 197, -1));
/*     */     
/* 169 */     label_correo1.setText("Correo");
/* 170 */     add(label_correo1, new AbsoluteConstraints(450, 310, -1, -1));
/* 171 */     add(txt_correo1, new AbsoluteConstraints(450, 330, 197, -1));
/* 172 */     add(txt_celular1, new AbsoluteConstraints(670, 330, 95, -1));
/*     */     
/* 174 */     label_celular1.setText("Celular");
/* 175 */     add(label_celular1, new AbsoluteConstraints(670, 310, -1, -1));
/*     */     
/* 177 */     label_telefono11.setText("Telefono 1");
/* 178 */     add(label_telefono11, new AbsoluteConstraints(780, 310, -1, -1));
/* 179 */     add(txt_telefono11, new AbsoluteConstraints(780, 330, 95, -1));
/* 180 */     add(txt_telefono12, new AbsoluteConstraints(890, 330, 95, -1));
/*     */     
/* 182 */     label_telefono12.setText("Telefono 2");
/* 183 */     add(label_telefono12, new AbsoluteConstraints(890, 310, -1, -1));
/* 184 */     add(txt_telefono13, new AbsoluteConstraints(1000, 330, 95, -1));
/*     */     
/* 186 */     label_telefono13.setText("Telefono 3");
/* 187 */     add(label_telefono13, new AbsoluteConstraints(1000, 310, -1, -1));
/*     */     
/* 189 */     label_contacto2.setText("Contacto 2");
/* 190 */     add(label_contacto2, new AbsoluteConstraints(20, 380, -1, -1));
/* 191 */     add(txt_contacto2, new AbsoluteConstraints(20, 410, 197, -1));
/*     */     
/* 193 */     label_cargo2.setText("Cargo");
/* 194 */     add(label_cargo2, new AbsoluteConstraints(240, 380, -1, -1));
/* 195 */     add(txt_cargo2, new AbsoluteConstraints(240, 410, 197, -1));
/*     */     
/* 197 */     label_correo2.setText("Correo");
/* 198 */     add(label_correo2, new AbsoluteConstraints(450, 380, -1, -1));
/* 199 */     add(txt_correo2, new AbsoluteConstraints(450, 410, 197, -1));
/*     */     
/* 201 */     label_celular2.setText("Celular");
/* 202 */     add(label_celular2, new AbsoluteConstraints(670, 380, -1, -1));
/* 203 */     add(txt_celular2, new AbsoluteConstraints(670, 410, 95, -1));
/*     */     
/* 205 */     label_telefono21.setText("Telefono 1");
/* 206 */     add(label_telefono21, new AbsoluteConstraints(780, 380, -1, -1));
/* 207 */     add(txt_telefono21, new AbsoluteConstraints(780, 410, 95, -1));
/* 208 */     add(txt_telefono22, new AbsoluteConstraints(890, 410, 95, -1));
/*     */     
/* 210 */     label_telefono22.setText("Telefono 2");
/* 211 */     add(label_telefono22, new AbsoluteConstraints(890, 380, -1, -1));
/*     */     
/* 213 */     label_telefono23.setText("Telefono 3");
/* 214 */     add(label_telefono23, new AbsoluteConstraints(1000, 380, -1, -1));
/* 215 */     add(txt_telefono23, new AbsoluteConstraints(1000, 410, 95, -1));
/*     */     
/* 217 */     label_contacto3.setText("Contacto 3");
/* 218 */     add(label_contacto3, new AbsoluteConstraints(20, 460, -1, -1));
/* 219 */     add(txt_contacto3, new AbsoluteConstraints(20, 480, 197, -1));
/*     */     
/* 221 */     label_cargo3.setText("Cargo");
/* 222 */     add(label_cargo3, new AbsoluteConstraints(240, 460, -1, -1));
/* 223 */     add(txt_cargo3, new AbsoluteConstraints(240, 480, 197, -1));
/*     */     
/* 225 */     label_correo3.setText("Correo");
/* 226 */     add(label_correo3, new AbsoluteConstraints(450, 460, -1, -1));
/* 227 */     add(txt_correo3, new AbsoluteConstraints(450, 480, 197, -1));
/*     */     
/* 229 */     label_celular3.setText("Celular");
/* 230 */     add(label_celular3, new AbsoluteConstraints(670, 460, -1, -1));
/* 231 */     add(txt_celular3, new AbsoluteConstraints(670, 480, 95, -1));
/*     */     
/* 233 */     label_telefono31.setText("Telefono 1");
/* 234 */     add(label_telefono31, new AbsoluteConstraints(780, 460, -1, -1));
/* 235 */     add(txt_telefono31, new AbsoluteConstraints(780, 480, 95, -1));
/*     */     
/* 237 */     label_telefono32.setText("Telefono 2");
/* 238 */     add(label_telefono32, new AbsoluteConstraints(890, 460, -1, -1));
/* 239 */     add(txt_telefono32, new AbsoluteConstraints(890, 480, 95, -1));
/*     */     
/* 241 */     label_telefono33.setText("Telefono 3");
/* 242 */     add(label_telefono33, new AbsoluteConstraints(1000, 460, -1, -1));
/* 243 */     add(txt_telefono33, new AbsoluteConstraints(1000, 480, 95, -1));
/* 244 */     add(txt_celular4, new AbsoluteConstraints(670, 560, 95, -1));
/*     */     
/* 246 */     label_contactofac.setText("Contacto facturación");
/* 247 */     add(label_contactofac, new AbsoluteConstraints(20, 600, -1, -1));
/*     */     
/* 249 */     label_telefono43.setText("Telefono 3");
/* 250 */     add(label_telefono43, new AbsoluteConstraints(1000, 530, -1, -1));
/*     */     
/* 252 */     label_celular4.setText("Celular");
/* 253 */     add(label_celular4, new AbsoluteConstraints(670, 530, -1, -1));
/*     */     
/* 255 */     label_telefono41.setText("Telefono 1");
/* 256 */     add(label_telefono41, new AbsoluteConstraints(780, 530, -1, -1));
/* 257 */     add(txt_correo4, new AbsoluteConstraints(450, 560, 197, -1));
/* 258 */     add(txt_telefono43, new AbsoluteConstraints(1000, 560, 95, -1));
/*     */     
/* 260 */     label_correo4.setText("Correo");
/* 261 */     add(label_correo4, new AbsoluteConstraints(450, 530, -1, -1));
/* 262 */     add(txt_contactofac, new AbsoluteConstraints(20, 630, 197, -1));
/*     */     
/* 264 */     label_telefono42.setText("Telefono 2");
/* 265 */     add(label_telefono42, new AbsoluteConstraints(890, 530, -1, -1));
/* 266 */     add(txt_telefono42, new AbsoluteConstraints(890, 560, 95, -1));
/* 267 */     add(txt_correofac, new AbsoluteConstraints(240, 630, 200, -1));
/*     */     
/* 269 */     label_cargo4.setText("Cargo");
/* 270 */     add(label_cargo4, new AbsoluteConstraints(240, 530, -1, -1));
/* 271 */     add(txt_telefono41, new AbsoluteConstraints(780, 560, 95, -1));
/*     */     
/* 273 */     boton_registrar.setBackground(new Color(255, 255, 255));
/* 274 */     boton_registrar.setIcon(new ImageIcon(getClass().getResource("/images/registrar64.png")));
/* 275 */     boton_registrar.setBorder((Border)null);
/* 276 */     boton_registrar.addActionListener(new ActionListener() {
/*     */           public void actionPerformed(ActionEvent evt) {
/* 278 */             panel_registrar.this.boton_registrarActionPerformed(evt);
/*     */           }
/*     */         });
/* 281 */     add(boton_registrar, new AbsoluteConstraints(440, 110, 80, 80));
/*     */     
/* 283 */     label_nit.setText("Nit");
/* 284 */     add(label_nit, new AbsoluteConstraints(20, 140, -1, -1));
/*     */     
/* 286 */     label_nombre.setText("Nombre comercial");
/* 287 */     add(label_nombre, new AbsoluteConstraints(130, 140, -1, -1));
/*     */     
/* 289 */     label_contacto4.setText("Contacto 4");
/* 290 */     add(label_contacto4, new AbsoluteConstraints(20, 530, -1, -1));
/* 291 */     add(txt_contacto4, new AbsoluteConstraints(20, 560, 197, -1));
/*     */     
/* 293 */     label_correofac.setText("Correo facturación");
/* 294 */     add(label_correofac, new AbsoluteConstraints(240, 600, -1, -1));
/* 295 */     add(txt_cargo4, new AbsoluteConstraints(240, 560, 197, -1));
/*     */     
/* 297 */     label_fondo.setIcon(new ImageIcon(getClass().getResource("/images/fondoblanco.png")));
/* 298 */     add(label_fondo, new AbsoluteConstraints(0, 0, 1360, 710));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private void boton_limpiarActionPerformed(ActionEvent evt) {
/* 304 */     txt_nit.setText((String)null);
/* 305 */     txt_nombre.setText((String)null);
/* 306 */     txt_razon.setText((String)null);
/* 307 */     txt_ciudad.setText((String)null);
/* 308 */     txt_direccion.setText((String)null);
/*     */ 
/*     */     
/* 311 */     txt_contacto1.setText((String)null);
/* 312 */     txt_cargo1.setText((String)null);
/* 313 */     txt_celular1.setText((String)null);
/* 314 */     txt_correo1.setText((String)null);
/* 315 */     txt_telefono11.setText((String)null);
/* 316 */     txt_telefono12.setText((String)null);
/* 317 */     txt_telefono13.setText((String)null);
/*     */ 
/*     */     
/* 320 */     txt_contacto2.setText((String)null);
/* 321 */     txt_cargo2.setText((String)null);
/* 322 */     txt_celular2.setText((String)null);
/* 323 */     txt_correo2.setText((String)null);
/* 324 */     txt_telefono21.setText((String)null);
/* 325 */     txt_telefono22.setText((String)null);
/* 326 */     txt_telefono23.setText((String)null);
/*     */ 
/*     */     
/* 329 */     txt_contacto3.setText((String)null);
/* 330 */     txt_cargo3.setText((String)null);
/* 331 */     txt_celular3.setText((String)null);
/* 332 */     txt_correo3.setText((String)null);
/* 333 */     txt_telefono31.setText((String)null);
/* 334 */     txt_telefono32.setText((String)null);
/* 335 */     txt_telefono33.setText((String)null);
/*     */ 
/*     */     
/* 338 */     txt_contactofac.setText((String)null);
/* 339 */     txt_correofac.setText((String)null);
/* 340 */     txt_celular4.setText((String)null);
/* 341 */     txt_correo4.setText((String)null);
/* 342 */     txt_telefono41.setText((String)null);
/* 343 */     txt_telefono42.setText((String)null);
/* 344 */     txt_telefono43.setText((String)null);
/*     */ 
/*     */     
/* 347 */     txt_contactofac.setText((String)null);
/* 348 */     txt_correofac.setText((String)null);
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
/*     */   private void boton_registrarActionPerformed(ActionEvent evt) {
/* 363 */     String nit = txt_nit.getText().trim();
/* 364 */     String razon = txt_razon.getText().trim();
/* 365 */     String nombre = txt_nombre.getText().trim();
/* 366 */     String ciudad = txt_ciudad.getText().trim();
/* 367 */     String direccion = txt_direccion.getText().trim();
/*     */     
/* 369 */     String contacto1 = txt_contacto1.getText().trim();
/* 370 */     String cargo1 = txt_cargo1.getText().trim();
/* 371 */     String correo1 = txt_correo1.getText().trim();
/* 372 */     String celular1 = txt_celular1.getText().trim();
/* 373 */     String telefono11 = txt_telefono11.getText().trim();
/* 374 */     String telefono12 = txt_telefono12.getText().trim();
/* 375 */     String telefono13 = txt_telefono13.getText().trim();
/*     */     
/* 377 */     String contacto2 = txt_contacto2.getText().trim();
/* 378 */     String cargo2 = txt_cargo2.getText().trim();
/* 379 */     String correo2 = txt_correo2.getText().trim();
/* 380 */     String celular2 = txt_celular2.getText().trim();
/* 381 */     String telefono21 = txt_telefono21.getText().trim();
/* 382 */     String telefono22 = txt_telefono22.getText().trim();
/* 383 */     String telefono23 = txt_telefono23.getText().trim();
/*     */     
/* 385 */     String contacto3 = txt_contacto3.getText().trim();
/* 386 */     String cargo3 = txt_cargo3.getText().trim();
/* 387 */     String correo3 = txt_correo3.getText().trim();
/* 388 */     String celular3 = txt_celular3.getText().trim();
/* 389 */     String telefono31 = txt_telefono31.getText().trim();
/* 390 */     String telefono32 = txt_telefono32.getText().trim();
/* 391 */     String telefono33 = txt_telefono33.getText().trim();
/*     */     
/* 393 */     String contacto4 = txt_contactofac.getText().trim();
/* 394 */     String cargo4 = txt_correofac.getText().trim();
/* 395 */     String correo4 = txt_correo4.getText().trim();
/* 396 */     String celular4 = txt_celular4.getText().trim();
/* 397 */     String telefono41 = txt_telefono41.getText().trim();
/* 398 */     String telefono42 = txt_telefono42.getText().trim();
/* 399 */     String telefono43 = txt_telefono43.getText().trim();
/*     */     
/* 401 */     String contactofac = txt_contactofac.getText().trim();
/* 402 */     String correofac = txt_correofac.getText().trim();
/*     */     
/* 404 */     if (nit.equals("")) {
/* 405 */       txt_nit.setBackground(Color.RED);
/* 406 */       this.validacion++;
/*     */     } 
/*     */     
/* 409 */     if (nombre.equals("")) {
/* 410 */       txt_nombre.setBackground(Color.RED);
/* 411 */       this.validacion++;
/*     */     } 
/*     */ 
/*     */     
/* 415 */     this.yes_no = JOptionPane.showConfirmDialog(this, "¿Desea registrar la empresa " + nombre + "?", "Registrar", 0);
/*     */ 
/*     */ 
/*     */     
/* 419 */     if (this.yes_no == 0) {
/*     */       
/*     */       try {
/* 422 */         Fillo fillo1r = new Fillo();
/* 423 */         Connection connection1r = fillo1r.getConnection(this.ruta2 + "\\clientes3.xlsx");
/* 424 */         String strQuery1r = "select distinct nit from correos where nit=" + nit;
/* 425 */         Recordset recordset1r = connection1r.executeQuery(strQuery1r);
/*     */         
/* 427 */         if (recordset1r.next()) {
/* 428 */           txt_nit.setBackground(Color.BLUE);
/* 429 */           this.yes_no2 = JOptionPane.showConfirmDialog(this, "El Nit " + nit + " ya ha sido registrado", "Error", -1);
/*     */ 
/*     */           
/* 432 */           if (this.yes_no2 == 0) {
/* 433 */             txt_nit.setBackground(Color.WHITE);
/*     */           }
/*     */ 
/*     */           
/* 437 */           connection1r.close();
/* 438 */           recordset1r.close();
/*     */         
/*     */         }
/*     */ 
/*     */       
/*     */       }
/* 444 */       catch (Exception e) {
/*     */ 
/*     */         
/*     */         try {
/* 448 */           if (this.validacion == 0) {
/* 449 */             Fillo fillo2r = new Fillo();
/* 450 */             Connection connection2r = fillo2r.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*     */             
/* 452 */             String strQuery2r = "INSERT INTO correos (nit, razonsocial, nombre , ciudad, direccion, contacto1, cargo1, correo1, celular1, telefono11, telefono12, telefono13,contacto2, cargo2, correo2, celular2, telefono21, telefono22, telefono23,contacto3, cargo3, correo3, celular3, telefono31, telefono32, telefono33,contacto4, cargo4, correo4, celular4, telefono41, telefono42, telefono43,contactofac, correofac) VALUES (' " + nit + "','" + razon + "','" + nombre + "','" + ciudad + "','" + direccion + "','" + contacto1 + "','" + cargo1 + "','" + correo1 + "','" + celular1 + "','" + telefono11 + "','" + telefono12 + "','" + telefono13 + "','" + contacto2 + "','" + cargo2 + "','" + correo2 + "','" + celular2 + "','" + telefono21 + "','" + telefono22 + "','" + telefono23 + "','" + contacto3 + "','" + cargo3 + "','" + correo3 + "','" + celular3 + "','" + telefono31 + "','" + telefono32 + "','" + telefono33 + "','" + contacto4 + "','" + cargo4 + "','" + correo4 + "','" + celular4 + "','" + telefono41 + "','" + telefono42 + "','" + telefono43 + "','" + contactofac + "','" + correofac + "')";
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
/* 465 */             connection2r.executeUpdate(strQuery2r);
/* 466 */             JOptionPane.showMessageDialog(null, "La empresa " + nombre + " se ha registrado exitosamente");
/* 467 */             connection2r.close();
/* 468 */             Limpiar();
/* 469 */           } else if (this.validacion != 0) {
/*     */             
/* 471 */             this.yes_no3 = JOptionPane.showConfirmDialog(this, "Se deben llenar los campos de NIT y nombre comercial", "Error", -1);
/*     */ 
/*     */             
/* 474 */             if (this.yes_no3 == 0) {
/* 475 */               txt_nit.setBackground(Color.WHITE);
/* 476 */               txt_nombre.setBackground(Color.WHITE);
/*     */             } 
/*     */             
/* 479 */             this.validacion = 0;
/*     */           
/*     */           }
/*     */         
/*     */         }
/* 484 */         catch (Exception exception) {}
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 492 */     if (this.yes_no == 1) {
/* 493 */       txt_nit.setBackground(Color.WHITE);
/* 494 */       txt_nombre.setBackground(Color.WHITE);
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
/* 505 */     txt_nit.setText("");
/* 506 */     txt_razon.setText("");
/* 507 */     txt_nombre.setText("");
/* 508 */     txt_ciudad.setText("");
/* 509 */     txt_direccion.setText("");
/*     */     
/* 511 */     txt_contacto1.setText("");
/* 512 */     txt_cargo1.setText("");
/* 513 */     txt_correo1.setText("");
/* 514 */     txt_celular1.setText("");
/* 515 */     txt_telefono11.setText("");
/* 516 */     txt_telefono12.setText("");
/* 517 */     txt_telefono13.setText("");
/*     */     
/* 519 */     txt_contacto2.setText("");
/* 520 */     txt_cargo2.setText("");
/* 521 */     txt_correo2.setText("");
/* 522 */     txt_celular2.setText("");
/* 523 */     txt_telefono21.setText("");
/* 524 */     txt_telefono22.setText("");
/* 525 */     txt_telefono23.setText("");
/*     */     
/* 527 */     txt_contacto3.setText("");
/* 528 */     txt_cargo3.setText("");
/* 529 */     txt_correo3.setText("");
/* 530 */     txt_celular3.setText("");
/* 531 */     txt_telefono31.setText("");
/* 532 */     txt_telefono32.setText("");
/* 533 */     txt_telefono33.setText("");
/*     */     
/* 535 */     txt_contactofac.setText("");
/* 536 */     txt_correofac.setText("");
/* 537 */     txt_correo4.setText("");
/* 538 */     txt_celular4.setText("");
/* 539 */     txt_telefono41.setText("");
/* 540 */     txt_telefono42.setText("");
/* 541 */     txt_telefono43.setText("");
/*     */     
/* 543 */     txt_contactofac.setText("");
/* 544 */     txt_correofac.setText("");
/*     */     
/* 546 */     txt_nit.setBackground(Color.WHITE);
/* 547 */     txt_nombre.setBackground(Color.WHITE);
/*     */   }
/*     */ }


/* Location:              C:\Users\David\Desktop\Programa_cliente\Programa\dist\Sistema de gestion de clientes.jar!\sistema_de_gestion_de_clientes_excel\panel_registrar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */