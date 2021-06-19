/*      */ package sistema_de_gestion_de_clientes_excel;
/*      */ 
/*      */ import com.codoid.products.fillo.Connection;
/*      */ import com.codoid.products.fillo.Fillo;
/*      */ import com.codoid.products.fillo.Recordset;
/*      */ import com.mxrck.autocompleter.TextAutoCompleter;
/*      */ import java.awt.Color;
/*      */ import java.awt.EventQueue;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.ItemEvent;
/*      */ import java.awt.event.ItemListener;
/*      */ import java.util.logging.Level;
/*      */ import java.util.logging.Logger;
/*      */ import javax.swing.GroupLayout;
/*      */ import javax.swing.Icon;
/*      */ import javax.swing.ImageIcon;
/*      */ import javax.swing.JButton;
/*      */ import javax.swing.JCheckBoxMenuItem;
/*      */ import javax.swing.JFrame;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JMenu;
/*      */ import javax.swing.JMenuBar;
/*      */ import javax.swing.JMenuItem;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.JTextField;
/*      */ import javax.swing.UIManager;
/*      */ import javax.swing.UnsupportedLookAndFeelException;
/*      */ import javax.swing.border.Border;
/*      */ import org.netbeans.lib.awtextra.AbsoluteConstraints;
/*      */ import org.netbeans.lib.awtextra.AbsoluteLayout;
/*      */ 
/*      */ public class principal
/*      */   extends JFrame {
/*   37 */   public String ruta2 = System.getProperty("user.dir");
/*   38 */   Color c = new Color(40, 54, 117);
/*   39 */   panel_consultar pc = new panel_consultar();
/*   40 */   panel_editar pe = new panel_editar();
/*   41 */   panel_registrar pr = new panel_registrar();
/*   42 */   panel_eliminar pel = new panel_eliminar();
/*   43 */   panel_bienvenida bi = new panel_bienvenida(); public static JButton boton_consultar; private JButton boton_editar;
/*      */   private JButton boton_eliminar;
/*      */   private JButton boton_registrar;
/*      */   private JCheckBoxMenuItem check_dark;
/*      */   private JCheckBoxMenuItem check_light;
/*      */   private JPanel contenedor;
/*      */   private JMenu item_opciones;
/*      */   
/*      */   public principal() {
/*   52 */     initComponents();
/*   53 */     setTitle("Sistema de gestión de clientes HerraTec");
/*   54 */     setIconImage((new ImageIcon(getClass().getResource("/images/herratecicon2.png"))).getImage());
/*   55 */     setExtendedState(6);
/*   56 */     fondo_bienvenida();
/*      */   }
/*      */   private JMenu item_vista;
/*      */   private JLabel label_herratec;
/*      */   
/*      */   public void itemsconsultar() {
/*   62 */     TextAutoCompleter textautocompleter = new TextAutoCompleter(panel_consultar.txt_nombre_consultar);
/*      */ 
/*      */     
/*      */     try {
/*   66 */       Fillo fillo1c = new Fillo();
/*      */ 
/*      */       
/*   69 */       Connection connection1c = fillo1c.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*   70 */       String strQuery1c = "Select distinct nombre from correos ";
/*   71 */       Recordset recordset1c = connection1c.executeQuery(strQuery1c);
/*      */       
/*   73 */       while (recordset1c.next()) {
/*   74 */         textautocompleter.addItem(recordset1c.getField("nombre"));
/*      */       }
/*      */ 
/*      */       
/*   78 */       recordset1c.close();
/*   79 */       connection1c.close();
/*      */     
/*      */     }
/*   82 */     catch (Exception e) {
/*   83 */       JOptionPane.showMessageDialog(null, "no hay conexion");
/*      */     } 
/*      */   }
/*      */   private JMenuItem menu_bienvenida; private JMenu menu_modo; private JMenuBar menubar;
/*      */   private JTextField txt_consultar;
/*      */   
/*      */   public void itemseditar() {
/*   90 */     TextAutoCompleter textautocompleter = new TextAutoCompleter(panel_editar.txt_nombre_editar);
/*      */ 
/*      */     
/*      */     try {
/*   94 */       Fillo fillo1e = new Fillo();
/*      */ 
/*      */       
/*   97 */       Connection connection1e = fillo1e.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*   98 */       String strQuery1e = "Select distinct nombre from correos ";
/*   99 */       Recordset recordset1e = connection1e.executeQuery(strQuery1e);
/*      */       
/*  101 */       while (recordset1e.next()) {
/*  102 */         textautocompleter.addItem(recordset1e.getField("nombre"));
/*      */       }
/*      */       
/*  105 */       recordset1e.close();
/*  106 */       connection1e.close();
/*      */     }
/*  108 */     catch (Exception e) {
/*  109 */       JOptionPane.showMessageDialog(null, "no hay conexion");
/*      */     } 
/*      */   }
/*      */   private JTextField txt_editar; private JTextField txt_eliminar;
/*      */   private JTextField txt_registrar;
/*      */   
/*      */   public void itemseliminar() {
/*  116 */     TextAutoCompleter textautocompleter = new TextAutoCompleter(panel_eliminar.txt_nombre_eliminar);
/*      */ 
/*      */     
/*      */     try {
/*  120 */       Fillo fillo1b = new Fillo();
/*      */ 
/*      */       
/*  123 */       Connection connection1b = fillo1b.getConnection(this.ruta2 + "\\clientes3.xlsx");
/*  124 */       String strQuery1b = "Select distinct nombre from correos ";
/*  125 */       Recordset recordset1b = connection1b.executeQuery(strQuery1b);
/*      */       
/*  127 */       while (recordset1b.next()) {
/*  128 */         textautocompleter.addItem(recordset1b.getField("nombre"));
/*      */       
/*      */       }
/*      */     
/*      */     }
/*  133 */     catch (Exception e) {
/*  134 */       JOptionPane.showMessageDialog(null, "no hay conexion");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void initComponents() {
/*  150 */     boton_consultar = new JButton();
/*  151 */     this.boton_registrar = new JButton();
/*  152 */     this.boton_editar = new JButton();
/*  153 */     this.boton_eliminar = new JButton();
/*  154 */     this.txt_eliminar = new JTextField();
/*  155 */     this.txt_consultar = new JTextField();
/*  156 */     this.txt_registrar = new JTextField();
/*  157 */     this.txt_editar = new JTextField();
/*  158 */     this.contenedor = new JPanel();
/*  159 */     this.label_herratec = new JLabel();
/*  160 */     this.menubar = new JMenuBar();
/*  161 */     this.item_opciones = new JMenu();
/*  162 */     this.menu_bienvenida = new JMenuItem();
/*  163 */     this.item_vista = new JMenu();
/*  164 */     this.menu_modo = new JMenu();
/*  165 */     this.check_dark = new JCheckBoxMenuItem();
/*  166 */     this.check_light = new JCheckBoxMenuItem();
/*      */     
/*  168 */     setDefaultCloseOperation(3);
/*  169 */     setBackground(new Color(255, 255, 255));
/*  170 */     setIconImage(getIconImage());
/*  171 */     getContentPane().setLayout((LayoutManager)new AbsoluteLayout());
/*      */     
/*  173 */     boton_consultar.setBackground(new Color(255, 255, 255));
/*  174 */     boton_consultar.setIcon(new ImageIcon(getClass().getResource("/images/buscar1282.png")));
/*  175 */     boton_consultar.setToolTipText("");
/*  176 */     boton_consultar.setBorder((Border)null);
/*  177 */     boton_consultar.setHorizontalTextPosition(0);
/*  178 */     boton_consultar.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  180 */             principal.this.boton_consultarActionPerformed(evt);
/*      */           }
/*      */         });
/*  183 */     getContentPane().add(boton_consultar, new AbsoluteConstraints(0, 35, 162, 140));
/*      */     
/*  185 */     this.boton_registrar.setBackground(new Color(255, 255, 255));
/*  186 */     this.boton_registrar.setIcon(new ImageIcon(getClass().getResource("/images/registrar1282.png")));
/*  187 */     this.boton_registrar.setBorder((Border)null);
/*  188 */     this.boton_registrar.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  190 */             principal.this.boton_registrarActionPerformed(evt);
/*      */           }
/*      */         });
/*  193 */     getContentPane().add(this.boton_registrar, new AbsoluteConstraints(0, 207, 162, 150));
/*      */     
/*  195 */     this.boton_editar.setBackground(new Color(255, 255, 255));
/*  196 */     this.boton_editar.setIcon(new ImageIcon(getClass().getResource("/images/editar1282.png")));
/*  197 */     this.boton_editar.setBorder((Border)null);
/*  198 */     this.boton_editar.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  200 */             principal.this.boton_editarActionPerformed(evt);
/*      */           }
/*      */         });
/*  203 */     getContentPane().add(this.boton_editar, new AbsoluteConstraints(0, 372, 162, 150));
/*      */     
/*  205 */     this.boton_eliminar.setBackground(new Color(255, 255, 255));
/*  206 */     this.boton_eliminar.setIcon(new ImageIcon(getClass().getResource("/images/eliminar1282.png")));
/*  207 */     this.boton_eliminar.setBorder((Border)null);
/*  208 */     this.boton_eliminar.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  210 */             principal.this.boton_eliminarActionPerformed(evt);
/*      */           }
/*      */         });
/*  213 */     getContentPane().add(this.boton_eliminar, new AbsoluteConstraints(0, 540, 162, 143));
/*      */     
/*  215 */     this.txt_eliminar.setEditable(false);
/*  216 */     this.txt_eliminar.setBackground(new Color(255, 255, 255));
/*  217 */     this.txt_eliminar.setHorizontalAlignment(2);
/*  218 */     this.txt_eliminar.setText("             Eliminar");
/*  219 */     this.txt_eliminar.setToolTipText("");
/*  220 */     this.txt_eliminar.setBorder((Border)null);
/*  221 */     getContentPane().add(this.txt_eliminar, new AbsoluteConstraints(0, 522, 162, 20));
/*      */     
/*  223 */     this.txt_consultar.setEditable(false);
/*  224 */     this.txt_consultar.setBackground(new Color(255, 255, 255));
/*  225 */     this.txt_consultar.setHorizontalAlignment(2);
/*  226 */     this.txt_consultar.setText("              Consultar");
/*  227 */     this.txt_consultar.setToolTipText("");
/*  228 */     this.txt_consultar.setBorder((Border)null);
/*  229 */     getContentPane().add(this.txt_consultar, new AbsoluteConstraints(0, 0, 162, 40));
/*      */     
/*  231 */     this.txt_registrar.setEditable(false);
/*  232 */     this.txt_registrar.setBackground(new Color(255, 255, 255));
/*  233 */     this.txt_registrar.setHorizontalAlignment(2);
/*  234 */     this.txt_registrar.setText("             Registrar");
/*  235 */     this.txt_registrar.setToolTipText("");
/*  236 */     this.txt_registrar.setBorder((Border)null);
/*  237 */     getContentPane().add(this.txt_registrar, new AbsoluteConstraints(0, 172, 162, 40));
/*      */     
/*  239 */     this.txt_editar.setEditable(false);
/*  240 */     this.txt_editar.setBackground(new Color(255, 255, 255));
/*  241 */     this.txt_editar.setHorizontalAlignment(2);
/*  242 */     this.txt_editar.setText("             Editar");
/*  243 */     this.txt_editar.setToolTipText("");
/*  244 */     this.txt_editar.setBorder((Border)null);
/*  245 */     getContentPane().add(this.txt_editar, new AbsoluteConstraints(0, 350, 162, 30));
/*      */     
/*  247 */     this.contenedor.setBackground(new Color(255, 255, 255));
/*      */     
/*  249 */     this.label_herratec.setBackground(new Color(153, 153, 255));
/*      */     
/*  251 */     GroupLayout contenedorLayout = new GroupLayout(this.contenedor);
/*  252 */     this.contenedor.setLayout(contenedorLayout);
/*  253 */     contenedorLayout.setHorizontalGroup(contenedorLayout
/*  254 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  255 */         .addComponent(this.label_herratec, -1, -1, 32767));
/*      */     
/*  257 */     contenedorLayout.setVerticalGroup(contenedorLayout
/*  258 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/*  259 */         .addGroup(GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
/*  260 */           .addComponent(this.label_herratec, -2, 710, -2)
/*  261 */           .addGap(0, 0, 32767)));
/*      */ 
/*      */     
/*  264 */     getContentPane().add(this.contenedor, new AbsoluteConstraints(157, 0, 1213, 700));
/*      */     
/*  266 */     this.menubar.setBackground(new Color(255, 255, 255));
/*      */     
/*  268 */     this.item_opciones.setText("Opciones");
/*      */     
/*  270 */     this.menu_bienvenida.setIcon(new ImageIcon(getClass().getResource("/images/home2.png")));
/*  271 */     this.menu_bienvenida.setText("Página bienvenida");
/*  272 */     this.menu_bienvenida.addActionListener(new ActionListener() {
/*      */           public void actionPerformed(ActionEvent evt) {
/*  274 */             principal.this.menu_bienvenidaActionPerformed(evt);
/*      */           }
/*      */         });
/*  277 */     this.item_opciones.add(this.menu_bienvenida);
/*      */     
/*  279 */     this.menubar.add(this.item_opciones);
/*      */     
/*  281 */     this.item_vista.setText("Vista");
/*      */     
/*  283 */     this.menu_modo.setIcon(new ImageIcon(getClass().getResource("/images/brillo3.png")));
/*  284 */     this.menu_modo.setText("Modo");
/*      */     
/*  286 */     this.check_dark.setText("Dark");
/*  287 */     this.check_dark.addItemListener(new ItemListener() {
/*      */           public void itemStateChanged(ItemEvent evt) {
/*  289 */             principal.this.check_darkItemStateChanged(evt);
/*      */           }
/*      */         });
/*  292 */     this.menu_modo.add(this.check_dark);
/*      */     
/*  294 */     this.check_light.setSelected(true);
/*  295 */     this.check_light.setText("Light");
/*  296 */     this.check_light.addItemListener(new ItemListener() {
/*      */           public void itemStateChanged(ItemEvent evt) {
/*  298 */             principal.this.check_lightItemStateChanged(evt);
/*      */           }
/*      */         });
/*  301 */     this.menu_modo.add(this.check_light);
/*      */     
/*  303 */     this.item_vista.add(this.menu_modo);
/*      */     
/*  305 */     this.menubar.add(this.item_vista);
/*      */     
/*  307 */     setJMenuBar(this.menubar);
/*      */     
/*  309 */     pack();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void boton_editarActionPerformed(ActionEvent evt) {
/*  315 */     itemseditar();
/*      */ 
/*      */ 
/*      */     
/*  319 */     this.pe.setSize(1210, 700);
/*  320 */     this.pe.setLocation(5, 0);
/*  321 */     this.contenedor.removeAll();
/*      */     
/*  323 */     this.contenedor.add(this.pe, "Center");
/*  324 */     this.contenedor.revalidate();
/*  325 */     this.contenedor.repaint();
/*  326 */     dark_editar();
/*  327 */     light_editar();
/*  328 */     dark_frame();
/*  329 */     light_frame();
/*      */     
/*  331 */     if (this.check_light.isSelected() == true || this.check_dark.isSelected() == true) {
/*  332 */       this.boton_editar.setBackground(this.c);
/*  333 */       this.txt_editar.setBackground(this.c);
/*  334 */       this.txt_editar.setForeground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void boton_registrarActionPerformed(ActionEvent evt) {
/*  344 */     this.pr.setSize(1210, 700);
/*  345 */     this.pr.setLocation(5, 0);
/*  346 */     this.contenedor.removeAll();
/*      */     
/*  348 */     this.contenedor.add(this.pr, "Center");
/*  349 */     this.contenedor.revalidate();
/*  350 */     this.contenedor.repaint();
/*  351 */     dark_registrar();
/*  352 */     dark_frame();
/*  353 */     light_frame();
/*  354 */     light_registrar();
/*      */     
/*  356 */     if (this.check_light.isSelected() == true || this.check_dark.isSelected() == true) {
/*  357 */       this.boton_registrar.setBackground(this.c);
/*  358 */       this.txt_registrar.setBackground(this.c);
/*  359 */       this.txt_registrar.setForeground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   private void boton_eliminarActionPerformed(ActionEvent evt) {
/*  366 */     itemseliminar();
/*  367 */     this.txt_eliminar.setForeground(Color.WHITE);
/*      */ 
/*      */ 
/*      */     
/*  371 */     this.pel.setSize(1210, 700);
/*  372 */     this.pel.setLocation(5, 0);
/*  373 */     this.contenedor.removeAll();
/*      */     
/*  375 */     this.contenedor.add(this.pel, "Center");
/*  376 */     this.contenedor.revalidate();
/*  377 */     this.contenedor.repaint();
/*      */     
/*  379 */     dark_eliminar();
/*  380 */     dark_frame();
/*  381 */     light_frame();
/*  382 */     light_eliminar();
/*      */     
/*  384 */     if (this.check_light.isSelected() == true || this.check_dark.isSelected() == true) {
/*  385 */       this.boton_eliminar.setBackground(this.c);
/*  386 */       this.txt_eliminar.setBackground(this.c);
/*  387 */       this.txt_eliminar.setForeground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void menu_bienvenidaActionPerformed(ActionEvent evt) {
/*  395 */     if (this.check_dark.isSelected() == true) {
/*  396 */       ImageIcon wallpaper2 = new ImageIcon("src/images/herratecfonfonegro.png");
/*  397 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1210, 710, 1));
/*      */       
/*  399 */       panel_bienvenida.label_fondo.setIcon(icono2);
/*      */       
/*  401 */       repaint();
/*      */       
/*  403 */       this.boton_editar.setBackground(Color.BLACK);
/*  404 */       this.txt_editar.setBackground(Color.BLACK);
/*  405 */       this.txt_editar.setForeground(Color.WHITE);
/*      */       
/*  407 */       boton_consultar.setBackground(Color.BLACK);
/*  408 */       this.txt_consultar.setBackground(Color.BLACK);
/*  409 */       this.txt_consultar.setForeground(Color.WHITE);
/*      */       
/*  411 */       this.boton_registrar.setBackground(Color.BLACK);
/*  412 */       this.txt_registrar.setBackground(Color.BLACK);
/*  413 */       this.txt_registrar.setForeground(Color.WHITE);
/*      */       
/*  415 */       this.boton_eliminar.setBackground(Color.BLACK);
/*  416 */       this.txt_eliminar.setBackground(Color.BLACK);
/*  417 */       this.txt_eliminar.setForeground(Color.WHITE);
/*      */     } 
/*      */ 
/*      */     
/*  421 */     if (this.check_light.isSelected() == true) {
/*  422 */       ImageIcon wallpaper2 = new ImageIcon("src/images/herratecfondo.png");
/*  423 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1210, 710, 1));
/*      */       
/*  425 */       panel_bienvenida.label_fondo.setIcon(icono2);
/*      */       
/*  427 */       repaint();
/*      */       
/*  429 */       this.boton_editar.setBackground(Color.WHITE);
/*  430 */       this.txt_editar.setBackground(Color.WHITE);
/*  431 */       this.txt_editar.setForeground(Color.BLACK);
/*      */       
/*  433 */       boton_consultar.setBackground(Color.WHITE);
/*  434 */       this.txt_consultar.setBackground(Color.WHITE);
/*  435 */       this.txt_consultar.setForeground(Color.BLACK);
/*      */       
/*  437 */       this.boton_registrar.setBackground(Color.WHITE);
/*  438 */       this.txt_registrar.setBackground(Color.WHITE);
/*  439 */       this.txt_registrar.setForeground(Color.BLACK);
/*      */       
/*  441 */       this.boton_eliminar.setBackground(Color.WHITE);
/*  442 */       this.txt_eliminar.setBackground(Color.WHITE);
/*  443 */       this.txt_eliminar.setForeground(Color.BLACK);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  449 */     this.bi.setSize(1210, 700);
/*  450 */     this.bi.setLocation(0, 0);
/*  451 */     this.contenedor.removeAll();
/*      */     
/*  453 */     this.contenedor.add(this.bi, "Center");
/*  454 */     this.contenedor.revalidate();
/*  455 */     this.contenedor.repaint();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void boton_consultarActionPerformed(ActionEvent evt) {
/*  462 */     itemsconsultar();
/*      */     
/*  464 */     this.pc.setSize(1210, 700);
/*  465 */     this.pc.setLocation(5, 0);
/*  466 */     this.contenedor.removeAll();
/*      */     
/*  468 */     this.contenedor.add(this.pc, "Center");
/*  469 */     this.contenedor.revalidate();
/*  470 */     this.contenedor.repaint();
/*      */ 
/*      */     
/*  473 */     ImageIcon wallpaper = new ImageIcon("src/images/fondoblanco2.png");
/*  474 */     Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(1360, 710, 1));
/*  475 */     panel_consultar.label_fondo.setIcon(icono);
/*  476 */     repaint();
/*  477 */     this.contenedor.revalidate();
/*  478 */     this.contenedor.repaint();
/*  479 */     dark_consultar();
/*  480 */     light_consultar();
/*  481 */     dark_frame();
/*  482 */     light_frame();
/*      */ 
/*      */     
/*  485 */     if (this.check_light.isSelected() == true || this.check_dark.isSelected() == true) {
/*  486 */       boton_consultar.setBackground(this.c);
/*  487 */       this.txt_consultar.setBackground(this.c);
/*  488 */       this.txt_consultar.setForeground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void check_darkItemStateChanged(ItemEvent evt) {
/*  508 */     if (this.check_dark.isSelected() == true) {
/*  509 */       this.check_light.setSelected(false);
/*      */     }
/*      */     
/*  512 */     dark_frame();
/*      */     
/*  514 */     if (this.pc.isEnabled() == true && this.check_dark.isSelected() == true) {
/*  515 */       dark_consultar();
/*      */     }
/*  517 */     if (this.pe.isEnabled() == true && this.check_dark.isSelected() == true) {
/*  518 */       dark_editar();
/*      */     }
/*  520 */     if (this.pr.isEnabled() == true && this.check_dark.isSelected() == true) {
/*  521 */       dark_registrar();
/*      */     }
/*  523 */     if (this.pel.isEnabled() == true && this.check_dark.isSelected() == true) {
/*  524 */       dark_eliminar();
/*      */     }
/*  526 */     if (this.bi.isEnabled() == true && this.check_dark.isSelected() == true) {
/*  527 */       ImageIcon wallpaper2 = new ImageIcon("src/images/herratecfonfonegro.png");
/*  528 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1210, 710, 1));
/*  529 */       panel_bienvenida.label_fondo.setIcon(icono2);
/*  530 */       repaint();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private void check_lightItemStateChanged(ItemEvent evt) {
/*  538 */     if (this.check_light.isSelected() == true) {
/*  539 */       this.check_dark.setSelected(false);
/*      */     }
/*      */     
/*  542 */     light_frame();
/*      */     
/*  544 */     if (this.pc.isEnabled() == true && this.check_light.isSelected() == true) {
/*  545 */       light_consultar();
/*      */     }
/*  547 */     if (this.pe.isEnabled() == true && this.check_light.isSelected() == true) {
/*  548 */       light_editar();
/*      */     }
/*  550 */     if (this.pr.isEnabled() == true && this.check_light.isSelected() == true) {
/*  551 */       light_registrar();
/*      */     }
/*  553 */     if (this.pel.isEnabled() == true && this.check_light.isSelected() == true) {
/*  554 */       light_eliminar();
/*      */     }
/*  556 */     if (this.bi.isEnabled() == true && this.check_light.isSelected() == true) {
/*  557 */       ImageIcon wallpaper2 = new ImageIcon("src/images/herratecfondo.png");
/*  558 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1210, 710, 1));
/*  559 */       panel_bienvenida.label_fondo.setIcon(icono2);
/*  560 */       repaint();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void dark_consultar() {
/*  568 */     if (this.check_dark.isSelected() == true) {
/*      */       
/*  570 */       ImageIcon wallpaper = new ImageIcon("src/images/fondonegro.png");
/*  571 */       Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(1360, 710, 1));
/*  572 */       panel_consultar.label_fondo.setIcon(icono);
/*      */       
/*  574 */       repaint();
/*  575 */       this.contenedor.revalidate();
/*  576 */       this.contenedor.repaint();
/*      */ 
/*      */ 
/*      */       
/*  580 */       panel_consultar.txt_razon.setBackground(Color.BLACK);
/*  581 */       panel_consultar.txt_ciudad.setBackground(Color.BLACK);
/*  582 */       panel_consultar.txt_direccion.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  585 */       panel_consultar.txt_contacto1.setBackground(Color.BLACK);
/*  586 */       panel_consultar.txt_cargo1.setBackground(Color.BLACK);
/*  587 */       panel_consultar.txt_celular1.setBackground(Color.BLACK);
/*  588 */       panel_consultar.txt_correo1.setBackground(Color.BLACK);
/*  589 */       panel_consultar.txt_telefono11.setBackground(Color.BLACK);
/*  590 */       panel_consultar.txt_telefono12.setBackground(Color.BLACK);
/*  591 */       panel_consultar.txt_telefono13.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  594 */       panel_consultar.txt_contacto2.setBackground(Color.BLACK);
/*  595 */       panel_consultar.txt_cargo2.setBackground(Color.BLACK);
/*  596 */       panel_consultar.txt_celular2.setBackground(Color.BLACK);
/*  597 */       panel_consultar.txt_correo2.setBackground(Color.BLACK);
/*  598 */       panel_consultar.txt_telefono21.setBackground(Color.BLACK);
/*  599 */       panel_consultar.txt_telefono22.setBackground(Color.BLACK);
/*  600 */       panel_consultar.txt_telefono23.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  603 */       panel_consultar.txt_contacto3.setBackground(Color.BLACK);
/*  604 */       panel_consultar.txt_cargo3.setBackground(Color.BLACK);
/*  605 */       panel_consultar.txt_celular3.setBackground(Color.BLACK);
/*  606 */       panel_consultar.txt_correo3.setBackground(Color.BLACK);
/*  607 */       panel_consultar.txt_telefono31.setBackground(Color.BLACK);
/*  608 */       panel_consultar.txt_telefono32.setBackground(Color.BLACK);
/*  609 */       panel_consultar.txt_telefono33.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  612 */       panel_consultar.txt_contacto4.setBackground(Color.BLACK);
/*  613 */       panel_consultar.txt_cargo4.setBackground(Color.BLACK);
/*  614 */       panel_consultar.txt_celular4.setBackground(Color.BLACK);
/*  615 */       panel_consultar.txt_correo4.setBackground(Color.BLACK);
/*  616 */       panel_consultar.txt_telefono41.setBackground(Color.BLACK);
/*  617 */       panel_consultar.txt_telefono42.setBackground(Color.BLACK);
/*  618 */       panel_consultar.txt_telefono43.setBackground(Color.BLACK);
/*      */       
/*  620 */       panel_consultar.txt_contactofac.setBackground(Color.BLACK);
/*  621 */       panel_consultar.txt_correofac.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  624 */       panel_consultar.boton_consultar.setBackground(Color.BLACK);
/*  625 */       panel_consultar.boton_limpiar.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  628 */       panel_consultar.check_nit.setBackground(Color.BLACK);
/*  629 */       panel_consultar.check_nombre.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  632 */       panel_consultar.label_razon.setForeground(Color.WHITE);
/*      */       
/*  634 */       panel_consultar.label_razon.setForeground(Color.WHITE);
/*  635 */       panel_consultar.label_ciudad.setForeground(Color.WHITE);
/*  636 */       panel_consultar.label_direccion.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  639 */       panel_consultar.label_contacto1.setForeground(Color.WHITE);
/*  640 */       panel_consultar.label_cargo1.setForeground(Color.WHITE);
/*  641 */       panel_consultar.label_celular1.setForeground(Color.WHITE);
/*  642 */       panel_consultar.label_correo1.setForeground(Color.WHITE);
/*  643 */       panel_consultar.label_telefono11.setForeground(Color.WHITE);
/*  644 */       panel_consultar.label_telefono12.setForeground(Color.WHITE);
/*  645 */       panel_consultar.label_telefono13.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  648 */       panel_consultar.label_contacto2.setForeground(Color.WHITE);
/*  649 */       panel_consultar.label_cargo2.setForeground(Color.WHITE);
/*  650 */       panel_consultar.label_celular2.setForeground(Color.WHITE);
/*  651 */       panel_consultar.label_correo2.setForeground(Color.WHITE);
/*  652 */       panel_consultar.label_telefono21.setForeground(Color.WHITE);
/*  653 */       panel_consultar.label_telefono22.setForeground(Color.WHITE);
/*  654 */       panel_consultar.label_telefono23.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  657 */       panel_consultar.label_contacto3.setForeground(Color.WHITE);
/*  658 */       panel_consultar.label_cargo3.setForeground(Color.WHITE);
/*  659 */       panel_consultar.label_celular3.setForeground(Color.WHITE);
/*  660 */       panel_consultar.label_correo3.setForeground(Color.WHITE);
/*  661 */       panel_consultar.label_telefono31.setForeground(Color.WHITE);
/*  662 */       panel_consultar.label_telefono32.setForeground(Color.WHITE);
/*  663 */       panel_consultar.label_telefono33.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  666 */       panel_consultar.label_contacto4.setForeground(Color.WHITE);
/*  667 */       panel_consultar.label_cargo4.setForeground(Color.WHITE);
/*  668 */       panel_consultar.label_celular4.setForeground(Color.WHITE);
/*  669 */       panel_consultar.label_correo4.setForeground(Color.WHITE);
/*  670 */       panel_consultar.label_telefono41.setForeground(Color.WHITE);
/*  671 */       panel_consultar.label_telefono42.setForeground(Color.WHITE);
/*  672 */       panel_consultar.label_telefono43.setForeground(Color.WHITE);
/*      */       
/*  674 */       panel_consultar.label_contactofac.setForeground(Color.WHITE);
/*  675 */       panel_consultar.label_correofac.setForeground(Color.WHITE);
/*  676 */       panel_consultar.label_seleccione.setForeground(Color.WHITE);
/*      */       
/*  678 */       panel_consultar.check_nit.setForeground(Color.WHITE);
/*  679 */       panel_consultar.check_nombre.setForeground(Color.WHITE);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  684 */       panel_consultar.txt_razon.setForeground(Color.WHITE);
/*  685 */       panel_consultar.txt_ciudad.setForeground(Color.WHITE);
/*  686 */       panel_consultar.txt_direccion.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  689 */       panel_consultar.txt_contacto1.setForeground(Color.WHITE);
/*  690 */       panel_consultar.txt_cargo1.setForeground(Color.WHITE);
/*  691 */       panel_consultar.txt_celular1.setForeground(Color.WHITE);
/*  692 */       panel_consultar.txt_correo1.setForeground(Color.WHITE);
/*  693 */       panel_consultar.txt_telefono11.setForeground(Color.WHITE);
/*  694 */       panel_consultar.txt_telefono12.setForeground(Color.WHITE);
/*  695 */       panel_consultar.txt_telefono13.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  698 */       panel_consultar.txt_contacto2.setForeground(Color.WHITE);
/*  699 */       panel_consultar.txt_cargo2.setForeground(Color.WHITE);
/*  700 */       panel_consultar.txt_celular2.setForeground(Color.WHITE);
/*  701 */       panel_consultar.txt_correo2.setForeground(Color.WHITE);
/*  702 */       panel_consultar.txt_telefono21.setForeground(Color.WHITE);
/*  703 */       panel_consultar.txt_telefono22.setForeground(Color.WHITE);
/*  704 */       panel_consultar.txt_telefono23.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  707 */       panel_consultar.txt_contacto3.setForeground(Color.WHITE);
/*  708 */       panel_consultar.txt_cargo3.setForeground(Color.WHITE);
/*  709 */       panel_consultar.txt_celular3.setForeground(Color.WHITE);
/*  710 */       panel_consultar.txt_correo3.setForeground(Color.WHITE);
/*  711 */       panel_consultar.txt_telefono31.setForeground(Color.WHITE);
/*  712 */       panel_consultar.txt_telefono32.setForeground(Color.WHITE);
/*  713 */       panel_consultar.txt_telefono33.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  716 */       panel_consultar.txt_contacto4.setForeground(Color.WHITE);
/*  717 */       panel_consultar.txt_cargo4.setForeground(Color.WHITE);
/*  718 */       panel_consultar.txt_celular4.setForeground(Color.WHITE);
/*  719 */       panel_consultar.txt_correo4.setForeground(Color.WHITE);
/*  720 */       panel_consultar.txt_telefono41.setForeground(Color.WHITE);
/*  721 */       panel_consultar.txt_telefono42.setForeground(Color.WHITE);
/*  722 */       panel_consultar.txt_telefono43.setForeground(Color.WHITE);
/*      */       
/*  724 */       panel_consultar.txt_contactofac.setForeground(Color.WHITE);
/*  725 */       panel_consultar.txt_correofac.setForeground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void dark_editar() {
/*  730 */     if (this.check_dark.isSelected() == true) {
/*      */       
/*  732 */       ImageIcon wallpaper2 = new ImageIcon("src/images/fondonegro.png");
/*  733 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1360, 710, 1));
/*      */       
/*  735 */       panel_editar.label_fondo.setIcon(icono2);
/*      */ 
/*      */       
/*  738 */       repaint();
/*  739 */       this.contenedor.revalidate();
/*  740 */       this.contenedor.repaint();
/*      */       
/*  742 */       panel_editar.txt_razon.setBackground(Color.BLACK);
/*  743 */       panel_editar.txt_ciudad.setBackground(Color.BLACK);
/*  744 */       panel_editar.txt_direccion.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  747 */       panel_editar.txt_contacto1.setBackground(Color.BLACK);
/*  748 */       panel_editar.txt_cargo1.setBackground(Color.BLACK);
/*  749 */       panel_editar.txt_celular1.setBackground(Color.BLACK);
/*  750 */       panel_editar.txt_correo1.setBackground(Color.BLACK);
/*  751 */       panel_editar.txt_telefono11.setBackground(Color.BLACK);
/*  752 */       panel_editar.txt_telefono12.setBackground(Color.BLACK);
/*  753 */       panel_editar.txt_telefono13.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  756 */       panel_editar.txt_contacto2.setBackground(Color.BLACK);
/*  757 */       panel_editar.txt_cargo2.setBackground(Color.BLACK);
/*  758 */       panel_editar.txt_celular2.setBackground(Color.BLACK);
/*  759 */       panel_editar.txt_correo2.setBackground(Color.BLACK);
/*  760 */       panel_editar.txt_telefono21.setBackground(Color.BLACK);
/*  761 */       panel_editar.txt_telefono22.setBackground(Color.BLACK);
/*  762 */       panel_editar.txt_telefono23.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  765 */       panel_editar.txt_contacto3.setBackground(Color.BLACK);
/*  766 */       panel_editar.txt_cargo3.setBackground(Color.BLACK);
/*  767 */       panel_editar.txt_celular3.setBackground(Color.BLACK);
/*  768 */       panel_editar.txt_correo3.setBackground(Color.BLACK);
/*  769 */       panel_editar.txt_telefono31.setBackground(Color.BLACK);
/*  770 */       panel_editar.txt_telefono32.setBackground(Color.BLACK);
/*  771 */       panel_editar.txt_telefono33.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  774 */       panel_editar.txt_contacto4.setBackground(Color.BLACK);
/*  775 */       panel_editar.txt_cargo4.setBackground(Color.BLACK);
/*  776 */       panel_editar.txt_celular4.setBackground(Color.BLACK);
/*  777 */       panel_editar.txt_correo4.setBackground(Color.BLACK);
/*  778 */       panel_editar.txt_telefono41.setBackground(Color.BLACK);
/*  779 */       panel_editar.txt_telefono42.setBackground(Color.BLACK);
/*  780 */       panel_editar.txt_telefono43.setBackground(Color.BLACK);
/*      */       
/*  782 */       panel_editar.txt_contactofac.setBackground(Color.BLACK);
/*  783 */       panel_editar.txt_correofac.setBackground(Color.BLACK);
/*      */       
/*  785 */       panel_editar.check_nit.setBackground(Color.BLACK);
/*  786 */       panel_editar.check_nit.setForeground(Color.WHITE);
/*  787 */       panel_editar.check_nombre.setBackground(Color.BLACK);
/*  788 */       panel_editar.check_nombre.setForeground(Color.WHITE);
/*      */ 
/*      */ 
/*      */       
/*  792 */       panel_editar.txt_razon.setForeground(Color.WHITE);
/*  793 */       panel_editar.txt_ciudad.setForeground(Color.WHITE);
/*  794 */       panel_editar.txt_direccion.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  797 */       panel_editar.txt_contacto1.setForeground(Color.WHITE);
/*  798 */       panel_editar.txt_cargo1.setForeground(Color.WHITE);
/*  799 */       panel_editar.txt_celular1.setForeground(Color.WHITE);
/*  800 */       panel_editar.txt_correo1.setForeground(Color.WHITE);
/*  801 */       panel_editar.txt_telefono11.setForeground(Color.WHITE);
/*  802 */       panel_editar.txt_telefono12.setForeground(Color.WHITE);
/*  803 */       panel_editar.txt_telefono12.setForeground(Color.WHITE);
/*      */       
/*  805 */       panel_editar.txt_contacto2.setForeground(Color.WHITE);
/*  806 */       panel_editar.txt_cargo2.setForeground(Color.WHITE);
/*  807 */       panel_editar.txt_celular2.setForeground(Color.WHITE);
/*  808 */       panel_editar.txt_correo2.setForeground(Color.WHITE);
/*  809 */       panel_editar.txt_telefono21.setForeground(Color.WHITE);
/*  810 */       panel_editar.txt_telefono22.setForeground(Color.WHITE);
/*  811 */       panel_editar.txt_telefono23.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  814 */       panel_editar.txt_contacto3.setForeground(Color.WHITE);
/*  815 */       panel_editar.txt_cargo3.setForeground(Color.WHITE);
/*  816 */       panel_editar.txt_celular3.setForeground(Color.WHITE);
/*  817 */       panel_editar.txt_correo3.setForeground(Color.WHITE);
/*  818 */       panel_editar.txt_telefono31.setForeground(Color.WHITE);
/*  819 */       panel_editar.txt_telefono32.setForeground(Color.WHITE);
/*  820 */       panel_editar.txt_telefono33.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  823 */       panel_editar.txt_contacto4.setForeground(Color.WHITE);
/*  824 */       panel_editar.txt_cargo4.setForeground(Color.WHITE);
/*  825 */       panel_editar.txt_celular4.setForeground(Color.WHITE);
/*  826 */       panel_editar.txt_correo4.setForeground(Color.WHITE);
/*  827 */       panel_editar.txt_telefono41.setForeground(Color.WHITE);
/*  828 */       panel_editar.txt_telefono42.setForeground(Color.WHITE);
/*  829 */       panel_editar.txt_telefono43.setForeground(Color.WHITE);
/*      */       
/*  831 */       panel_editar.txt_contactofac.setForeground(Color.WHITE);
/*  832 */       panel_editar.txt_correofac.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  835 */       panel_editar.label_razon.setForeground(Color.WHITE);
/*  836 */       panel_editar.label_ciudad.setForeground(Color.WHITE);
/*  837 */       panel_editar.label_direccion.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  840 */       panel_editar.label_contacto1.setForeground(Color.WHITE);
/*  841 */       panel_editar.label_cargo1.setForeground(Color.WHITE);
/*  842 */       panel_editar.label_celular1.setForeground(Color.WHITE);
/*  843 */       panel_editar.label_correo1.setForeground(Color.WHITE);
/*  844 */       panel_editar.label_telefono11.setForeground(Color.WHITE);
/*  845 */       panel_editar.label_telefono12.setForeground(Color.WHITE);
/*  846 */       panel_editar.label_telefono13.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  849 */       panel_editar.label_contacto2.setForeground(Color.WHITE);
/*  850 */       panel_editar.label_cargo2.setForeground(Color.WHITE);
/*  851 */       panel_editar.label_celular2.setForeground(Color.WHITE);
/*  852 */       panel_editar.label_correo2.setForeground(Color.WHITE);
/*  853 */       panel_editar.label_telefono21.setForeground(Color.WHITE);
/*  854 */       panel_editar.label_telefono22.setForeground(Color.WHITE);
/*  855 */       panel_editar.label_telefono23.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  858 */       panel_editar.label_contacto3.setForeground(Color.WHITE);
/*  859 */       panel_editar.label_cargo3.setForeground(Color.WHITE);
/*  860 */       panel_editar.label_celular3.setForeground(Color.WHITE);
/*  861 */       panel_editar.label_correo3.setForeground(Color.WHITE);
/*  862 */       panel_editar.label_telefono31.setForeground(Color.WHITE);
/*  863 */       panel_editar.label_telefono32.setForeground(Color.WHITE);
/*  864 */       panel_editar.label_telefono33.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  867 */       panel_editar.label_contacto4.setForeground(Color.WHITE);
/*  868 */       panel_editar.label_cargo4.setForeground(Color.WHITE);
/*  869 */       panel_editar.label_celular4.setForeground(Color.WHITE);
/*  870 */       panel_editar.label_correo4.setForeground(Color.WHITE);
/*  871 */       panel_editar.label_telefono41.setForeground(Color.WHITE);
/*  872 */       panel_editar.label_telefono42.setForeground(Color.WHITE);
/*  873 */       panel_editar.label_telefono43.setForeground(Color.WHITE);
/*      */       
/*  875 */       panel_editar.label_contactofac.setForeground(Color.WHITE);
/*  876 */       panel_editar.label_correofac.setForeground(Color.WHITE);
/*  877 */       panel_editar.label_seleccione.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  880 */       panel_editar.boton_consultar.setBackground(Color.BLACK);
/*  881 */       panel_editar.boton_limpiar.setBackground(Color.BLACK);
/*  882 */       panel_editar.boton_cambios.setBackground(Color.BLACK);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void dark_registrar() {
/*  887 */     if (this.check_dark.isSelected() == true) {
/*      */       
/*  889 */       ImageIcon wallpaper2 = new ImageIcon("src/images/fondonegro.png");
/*  890 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1360, 710, 1));
/*      */       
/*  892 */       panel_registrar.label_fondo.setIcon(icono2);
/*      */ 
/*      */       
/*  895 */       repaint();
/*  896 */       this.contenedor.revalidate();
/*  897 */       this.contenedor.repaint();
/*      */       
/*  899 */       panel_registrar.txt_nit.setBackground(Color.BLACK);
/*  900 */       panel_registrar.txt_nombre.setBackground(Color.BLACK);
/*  901 */       panel_registrar.txt_razon.setBackground(Color.BLACK);
/*  902 */       panel_registrar.txt_ciudad.setBackground(Color.BLACK);
/*  903 */       panel_registrar.txt_direccion.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  906 */       panel_registrar.txt_contacto1.setBackground(Color.BLACK);
/*  907 */       panel_registrar.txt_cargo1.setBackground(Color.BLACK);
/*  908 */       panel_registrar.txt_celular1.setBackground(Color.BLACK);
/*  909 */       panel_registrar.txt_correo1.setBackground(Color.BLACK);
/*  910 */       panel_registrar.txt_telefono11.setBackground(Color.BLACK);
/*  911 */       panel_registrar.txt_telefono12.setBackground(Color.BLACK);
/*  912 */       panel_registrar.txt_telefono13.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  915 */       panel_registrar.txt_contacto2.setBackground(Color.BLACK);
/*  916 */       panel_registrar.txt_cargo2.setBackground(Color.BLACK);
/*  917 */       panel_registrar.txt_celular2.setBackground(Color.BLACK);
/*  918 */       panel_registrar.txt_correo2.setBackground(Color.BLACK);
/*  919 */       panel_registrar.txt_telefono21.setBackground(Color.BLACK);
/*  920 */       panel_registrar.txt_telefono22.setBackground(Color.BLACK);
/*  921 */       panel_registrar.txt_telefono23.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  924 */       panel_registrar.txt_contacto3.setBackground(Color.BLACK);
/*  925 */       panel_registrar.txt_cargo3.setBackground(Color.BLACK);
/*  926 */       panel_registrar.txt_celular3.setBackground(Color.BLACK);
/*  927 */       panel_registrar.txt_correo3.setBackground(Color.BLACK);
/*  928 */       panel_registrar.txt_telefono31.setBackground(Color.BLACK);
/*  929 */       panel_registrar.txt_telefono32.setBackground(Color.BLACK);
/*  930 */       panel_registrar.txt_telefono33.setBackground(Color.BLACK);
/*      */ 
/*      */       
/*  933 */       panel_registrar.txt_contacto4.setBackground(Color.BLACK);
/*  934 */       panel_registrar.txt_cargo4.setBackground(Color.BLACK);
/*  935 */       panel_registrar.txt_celular4.setBackground(Color.BLACK);
/*  936 */       panel_registrar.txt_correo4.setBackground(Color.BLACK);
/*  937 */       panel_registrar.txt_telefono41.setBackground(Color.BLACK);
/*  938 */       panel_registrar.txt_telefono42.setBackground(Color.BLACK);
/*  939 */       panel_registrar.txt_telefono43.setBackground(Color.BLACK);
/*      */       
/*  941 */       panel_registrar.txt_contactofac.setBackground(Color.BLACK);
/*  942 */       panel_registrar.txt_correofac.setBackground(Color.BLACK);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  947 */       panel_registrar.txt_nit.setForeground(Color.WHITE);
/*  948 */       panel_registrar.txt_nombre.setForeground(Color.WHITE);
/*  949 */       panel_registrar.txt_razon.setForeground(Color.WHITE);
/*  950 */       panel_registrar.txt_ciudad.setForeground(Color.WHITE);
/*  951 */       panel_registrar.txt_direccion.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  954 */       panel_registrar.txt_contacto1.setForeground(Color.WHITE);
/*  955 */       panel_registrar.txt_cargo1.setForeground(Color.WHITE);
/*  956 */       panel_registrar.txt_celular1.setForeground(Color.WHITE);
/*  957 */       panel_registrar.txt_correo1.setForeground(Color.WHITE);
/*  958 */       panel_registrar.txt_telefono11.setForeground(Color.WHITE);
/*  959 */       panel_registrar.txt_telefono12.setForeground(Color.WHITE);
/*  960 */       panel_registrar.txt_telefono12.setForeground(Color.WHITE);
/*      */       
/*  962 */       panel_registrar.txt_contacto2.setForeground(Color.WHITE);
/*  963 */       panel_registrar.txt_cargo2.setForeground(Color.WHITE);
/*  964 */       panel_registrar.txt_celular2.setForeground(Color.WHITE);
/*  965 */       panel_registrar.txt_correo2.setForeground(Color.WHITE);
/*  966 */       panel_registrar.txt_telefono21.setForeground(Color.WHITE);
/*  967 */       panel_registrar.txt_telefono22.setForeground(Color.WHITE);
/*  968 */       panel_registrar.txt_telefono23.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  971 */       panel_registrar.txt_contacto3.setForeground(Color.WHITE);
/*  972 */       panel_registrar.txt_cargo3.setForeground(Color.WHITE);
/*  973 */       panel_registrar.txt_celular3.setForeground(Color.WHITE);
/*  974 */       panel_registrar.txt_correo3.setForeground(Color.WHITE);
/*  975 */       panel_registrar.txt_telefono31.setForeground(Color.WHITE);
/*  976 */       panel_registrar.txt_telefono32.setForeground(Color.WHITE);
/*  977 */       panel_registrar.txt_telefono33.setForeground(Color.WHITE);
/*      */ 
/*      */       
/*  980 */       panel_registrar.txt_contacto4.setForeground(Color.WHITE);
/*  981 */       panel_registrar.txt_cargo4.setForeground(Color.WHITE);
/*  982 */       panel_registrar.txt_celular4.setForeground(Color.WHITE);
/*  983 */       panel_registrar.txt_correo4.setForeground(Color.WHITE);
/*  984 */       panel_registrar.txt_telefono41.setForeground(Color.WHITE);
/*  985 */       panel_registrar.txt_telefono42.setForeground(Color.WHITE);
/*  986 */       panel_registrar.txt_telefono43.setForeground(Color.WHITE);
/*      */       
/*  988 */       panel_registrar.txt_contactofac.setForeground(Color.WHITE);
/*  989 */       panel_registrar.txt_correofac.setForeground(Color.WHITE);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  994 */       panel_registrar.label_nit.setForeground(Color.WHITE);
/*  995 */       panel_registrar.label_nombre.setForeground(Color.WHITE);
/*  996 */       panel_registrar.label_razon.setForeground(Color.WHITE);
/*  997 */       panel_registrar.label_ciudad.setForeground(Color.WHITE);
/*  998 */       panel_registrar.label_direccion.setForeground(Color.WHITE);
/*      */ 
/*      */       
/* 1001 */       panel_registrar.label_contacto1.setForeground(Color.WHITE);
/* 1002 */       panel_registrar.label_cargo1.setForeground(Color.WHITE);
/* 1003 */       panel_registrar.label_celular1.setForeground(Color.WHITE);
/* 1004 */       panel_registrar.label_correo1.setForeground(Color.WHITE);
/* 1005 */       panel_registrar.label_telefono11.setForeground(Color.WHITE);
/* 1006 */       panel_registrar.label_telefono12.setForeground(Color.WHITE);
/* 1007 */       panel_registrar.label_telefono13.setForeground(Color.WHITE);
/*      */ 
/*      */       
/* 1010 */       panel_registrar.label_contacto2.setForeground(Color.WHITE);
/* 1011 */       panel_registrar.label_cargo2.setForeground(Color.WHITE);
/* 1012 */       panel_registrar.label_celular2.setForeground(Color.WHITE);
/* 1013 */       panel_registrar.label_correo2.setForeground(Color.WHITE);
/* 1014 */       panel_registrar.label_telefono21.setForeground(Color.WHITE);
/* 1015 */       panel_registrar.label_telefono22.setForeground(Color.WHITE);
/* 1016 */       panel_registrar.label_telefono23.setForeground(Color.WHITE);
/*      */ 
/*      */       
/* 1019 */       panel_registrar.label_contacto3.setForeground(Color.WHITE);
/* 1020 */       panel_registrar.label_cargo3.setForeground(Color.WHITE);
/* 1021 */       panel_registrar.label_celular3.setForeground(Color.WHITE);
/* 1022 */       panel_registrar.label_correo3.setForeground(Color.WHITE);
/* 1023 */       panel_registrar.label_telefono31.setForeground(Color.WHITE);
/* 1024 */       panel_registrar.label_telefono32.setForeground(Color.WHITE);
/* 1025 */       panel_registrar.label_telefono33.setForeground(Color.WHITE);
/*      */ 
/*      */       
/* 1028 */       panel_registrar.label_contacto4.setForeground(Color.WHITE);
/* 1029 */       panel_registrar.label_cargo4.setForeground(Color.WHITE);
/* 1030 */       panel_registrar.label_celular4.setForeground(Color.WHITE);
/* 1031 */       panel_registrar.label_correo4.setForeground(Color.WHITE);
/* 1032 */       panel_registrar.label_telefono41.setForeground(Color.WHITE);
/* 1033 */       panel_registrar.label_telefono42.setForeground(Color.WHITE);
/* 1034 */       panel_registrar.label_telefono43.setForeground(Color.WHITE);
/*      */       
/* 1036 */       panel_registrar.label_contactofac.setForeground(Color.WHITE);
/* 1037 */       panel_registrar.label_correofac.setForeground(Color.WHITE);
/* 1038 */       panel_registrar.label_seleccione.setForeground(Color.WHITE);
/*      */ 
/*      */ 
/*      */       
/* 1042 */       panel_registrar.boton_registrar.setBackground(Color.BLACK);
/* 1043 */       panel_registrar.boton_limpiar.setBackground(Color.BLACK);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void dark_eliminar() {
/* 1048 */     if (this.check_dark.isSelected() == true) {
/*      */       
/* 1050 */       ImageIcon wallpaper2 = new ImageIcon("src/images/fondonegro.png");
/* 1051 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1360, 710, 1));
/*      */       
/* 1053 */       panel_eliminar.label_fondo.setIcon(icono2);
/*      */ 
/*      */       
/* 1056 */       repaint();
/* 1057 */       this.contenedor.revalidate();
/* 1058 */       this.contenedor.repaint();
/* 1059 */       panel_eliminar.check_nit.setBackground(Color.BLACK);
/* 1060 */       panel_eliminar.check_nit.setForeground(Color.WHITE);
/* 1061 */       panel_eliminar.check_nombre.setBackground(Color.BLACK);
/* 1062 */       panel_eliminar.check_nombre.setForeground(Color.WHITE);
/*      */       
/* 1064 */       panel_eliminar.label_seleccione.setForeground(Color.WHITE);
/*      */       
/* 1066 */       panel_eliminar.boton_eliminar.setBackground(Color.BLACK);
/* 1067 */       panel_eliminar.boton_limpiar.setBackground(Color.BLACK);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void light_consultar() {
/* 1075 */     if (this.check_light.isSelected() == true) {
/*      */       
/* 1077 */       ImageIcon wallpaper = new ImageIcon("src/images/fondoblanco2.png");
/* 1078 */       Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(1360, 710, 1));
/* 1079 */       panel_consultar.label_fondo.setIcon(icono);
/*      */       
/* 1081 */       repaint();
/* 1082 */       this.contenedor.revalidate();
/* 1083 */       this.contenedor.repaint();
/*      */ 
/*      */ 
/*      */       
/* 1087 */       panel_consultar.txt_razon.setBackground(Color.WHITE);
/* 1088 */       panel_consultar.txt_ciudad.setBackground(Color.WHITE);
/* 1089 */       panel_consultar.txt_direccion.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1092 */       panel_consultar.txt_contacto1.setBackground(Color.WHITE);
/* 1093 */       panel_consultar.txt_cargo1.setBackground(Color.WHITE);
/* 1094 */       panel_consultar.txt_celular1.setBackground(Color.WHITE);
/* 1095 */       panel_consultar.txt_correo1.setBackground(Color.WHITE);
/* 1096 */       panel_consultar.txt_telefono11.setBackground(Color.WHITE);
/* 1097 */       panel_consultar.txt_telefono12.setBackground(Color.WHITE);
/* 1098 */       panel_consultar.txt_telefono13.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1101 */       panel_consultar.txt_contacto2.setBackground(Color.WHITE);
/* 1102 */       panel_consultar.txt_cargo2.setBackground(Color.WHITE);
/* 1103 */       panel_consultar.txt_celular2.setBackground(Color.WHITE);
/* 1104 */       panel_consultar.txt_correo2.setBackground(Color.WHITE);
/* 1105 */       panel_consultar.txt_telefono21.setBackground(Color.WHITE);
/* 1106 */       panel_consultar.txt_telefono22.setBackground(Color.WHITE);
/* 1107 */       panel_consultar.txt_telefono23.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1110 */       panel_consultar.txt_contacto3.setBackground(Color.WHITE);
/* 1111 */       panel_consultar.txt_cargo3.setBackground(Color.WHITE);
/* 1112 */       panel_consultar.txt_celular3.setBackground(Color.WHITE);
/* 1113 */       panel_consultar.txt_correo3.setBackground(Color.WHITE);
/* 1114 */       panel_consultar.txt_telefono31.setBackground(Color.WHITE);
/* 1115 */       panel_consultar.txt_telefono32.setBackground(Color.WHITE);
/* 1116 */       panel_consultar.txt_telefono33.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1119 */       panel_consultar.txt_contacto4.setBackground(Color.WHITE);
/* 1120 */       panel_consultar.txt_cargo4.setBackground(Color.WHITE);
/* 1121 */       panel_consultar.txt_celular4.setBackground(Color.WHITE);
/* 1122 */       panel_consultar.txt_correo4.setBackground(Color.WHITE);
/* 1123 */       panel_consultar.txt_telefono41.setBackground(Color.WHITE);
/* 1124 */       panel_consultar.txt_telefono42.setBackground(Color.WHITE);
/* 1125 */       panel_consultar.txt_telefono43.setBackground(Color.WHITE);
/*      */       
/* 1127 */       panel_consultar.txt_contactofac.setBackground(Color.WHITE);
/* 1128 */       panel_consultar.txt_correofac.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1131 */       panel_consultar.boton_consultar.setBackground(Color.WHITE);
/* 1132 */       panel_consultar.boton_limpiar.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1135 */       panel_consultar.check_nit.setBackground(Color.WHITE);
/* 1136 */       panel_consultar.check_nombre.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1139 */       panel_consultar.label_razon.setForeground(Color.BLACK);
/*      */       
/* 1141 */       panel_consultar.label_razon.setForeground(Color.BLACK);
/* 1142 */       panel_consultar.label_ciudad.setForeground(Color.BLACK);
/* 1143 */       panel_consultar.label_direccion.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1146 */       panel_consultar.label_contacto1.setForeground(Color.BLACK);
/* 1147 */       panel_consultar.label_cargo1.setForeground(Color.BLACK);
/* 1148 */       panel_consultar.label_celular1.setForeground(Color.BLACK);
/* 1149 */       panel_consultar.label_correo1.setForeground(Color.BLACK);
/* 1150 */       panel_consultar.label_telefono11.setForeground(Color.BLACK);
/* 1151 */       panel_consultar.label_telefono12.setForeground(Color.BLACK);
/* 1152 */       panel_consultar.label_telefono13.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1155 */       panel_consultar.label_contacto2.setForeground(Color.BLACK);
/* 1156 */       panel_consultar.label_cargo2.setForeground(Color.BLACK);
/* 1157 */       panel_consultar.label_celular2.setForeground(Color.BLACK);
/* 1158 */       panel_consultar.label_correo2.setForeground(Color.BLACK);
/* 1159 */       panel_consultar.label_telefono21.setForeground(Color.BLACK);
/* 1160 */       panel_consultar.label_telefono22.setForeground(Color.BLACK);
/* 1161 */       panel_consultar.label_telefono23.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1164 */       panel_consultar.label_contacto3.setForeground(Color.BLACK);
/* 1165 */       panel_consultar.label_cargo3.setForeground(Color.BLACK);
/* 1166 */       panel_consultar.label_celular3.setForeground(Color.BLACK);
/* 1167 */       panel_consultar.label_correo3.setForeground(Color.BLACK);
/* 1168 */       panel_consultar.label_telefono31.setForeground(Color.BLACK);
/* 1169 */       panel_consultar.label_telefono32.setForeground(Color.BLACK);
/* 1170 */       panel_consultar.label_telefono33.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1173 */       panel_consultar.label_contacto4.setForeground(Color.BLACK);
/* 1174 */       panel_consultar.label_cargo4.setForeground(Color.BLACK);
/* 1175 */       panel_consultar.label_celular4.setForeground(Color.BLACK);
/* 1176 */       panel_consultar.label_correo4.setForeground(Color.BLACK);
/* 1177 */       panel_consultar.label_telefono41.setForeground(Color.BLACK);
/* 1178 */       panel_consultar.label_telefono42.setForeground(Color.BLACK);
/* 1179 */       panel_consultar.label_telefono43.setForeground(Color.BLACK);
/*      */       
/* 1181 */       panel_consultar.label_contactofac.setForeground(Color.BLACK);
/* 1182 */       panel_consultar.label_correofac.setForeground(Color.BLACK);
/* 1183 */       panel_consultar.label_seleccione.setForeground(Color.BLACK);
/*      */       
/* 1185 */       panel_consultar.check_nit.setForeground(Color.BLACK);
/* 1186 */       panel_consultar.check_nombre.setForeground(Color.BLACK);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1191 */       panel_consultar.txt_razon.setForeground(Color.BLACK);
/* 1192 */       panel_consultar.txt_ciudad.setForeground(Color.BLACK);
/* 1193 */       panel_consultar.txt_direccion.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1196 */       panel_consultar.txt_contacto1.setForeground(Color.BLACK);
/* 1197 */       panel_consultar.txt_cargo1.setForeground(Color.BLACK);
/* 1198 */       panel_consultar.txt_celular1.setForeground(Color.BLACK);
/* 1199 */       panel_consultar.txt_correo1.setForeground(Color.BLACK);
/* 1200 */       panel_consultar.txt_telefono11.setForeground(Color.BLACK);
/* 1201 */       panel_consultar.txt_telefono12.setForeground(Color.BLACK);
/* 1202 */       panel_consultar.txt_telefono13.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1205 */       panel_consultar.txt_contacto2.setForeground(Color.BLACK);
/* 1206 */       panel_consultar.txt_cargo2.setForeground(Color.BLACK);
/* 1207 */       panel_consultar.txt_celular2.setForeground(Color.BLACK);
/* 1208 */       panel_consultar.txt_correo2.setForeground(Color.BLACK);
/* 1209 */       panel_consultar.txt_telefono21.setForeground(Color.BLACK);
/* 1210 */       panel_consultar.txt_telefono22.setForeground(Color.BLACK);
/* 1211 */       panel_consultar.txt_telefono23.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1214 */       panel_consultar.txt_contacto3.setForeground(Color.BLACK);
/* 1215 */       panel_consultar.txt_cargo3.setForeground(Color.BLACK);
/* 1216 */       panel_consultar.txt_celular3.setForeground(Color.BLACK);
/* 1217 */       panel_consultar.txt_correo3.setForeground(Color.BLACK);
/* 1218 */       panel_consultar.txt_telefono31.setForeground(Color.BLACK);
/* 1219 */       panel_consultar.txt_telefono32.setForeground(Color.BLACK);
/* 1220 */       panel_consultar.txt_telefono33.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1223 */       panel_consultar.txt_contacto4.setForeground(Color.BLACK);
/* 1224 */       panel_consultar.txt_cargo4.setForeground(Color.BLACK);
/* 1225 */       panel_consultar.txt_celular4.setForeground(Color.BLACK);
/* 1226 */       panel_consultar.txt_correo4.setForeground(Color.BLACK);
/* 1227 */       panel_consultar.txt_telefono41.setForeground(Color.BLACK);
/* 1228 */       panel_consultar.txt_telefono42.setForeground(Color.BLACK);
/* 1229 */       panel_consultar.txt_telefono43.setForeground(Color.BLACK);
/*      */       
/* 1231 */       panel_consultar.txt_contactofac.setForeground(Color.BLACK);
/* 1232 */       panel_consultar.txt_correofac.setForeground(Color.BLACK);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void light_editar() {
/* 1237 */     if (this.check_light.isSelected() == true) {
/*      */       
/* 1239 */       ImageIcon wallpaper2 = new ImageIcon("src/images/fondoblanco2.png");
/* 1240 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1360, 710, 1));
/*      */       
/* 1242 */       panel_editar.label_fondo.setIcon(icono2);
/*      */ 
/*      */       
/* 1245 */       repaint();
/* 1246 */       this.contenedor.revalidate();
/* 1247 */       this.contenedor.repaint();
/* 1248 */       this.contenedor.revalidate();
/* 1249 */       this.contenedor.repaint();
/*      */       
/* 1251 */       panel_editar.txt_razon.setBackground(Color.WHITE);
/* 1252 */       panel_editar.txt_ciudad.setBackground(Color.WHITE);
/* 1253 */       panel_editar.txt_direccion.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1256 */       panel_editar.txt_contacto1.setBackground(Color.WHITE);
/* 1257 */       panel_editar.txt_cargo1.setBackground(Color.WHITE);
/* 1258 */       panel_editar.txt_celular1.setBackground(Color.WHITE);
/* 1259 */       panel_editar.txt_correo1.setBackground(Color.WHITE);
/* 1260 */       panel_editar.txt_telefono11.setBackground(Color.WHITE);
/* 1261 */       panel_editar.txt_telefono12.setBackground(Color.WHITE);
/* 1262 */       panel_editar.txt_telefono13.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1265 */       panel_editar.txt_contacto2.setBackground(Color.WHITE);
/* 1266 */       panel_editar.txt_cargo2.setBackground(Color.WHITE);
/* 1267 */       panel_editar.txt_celular2.setBackground(Color.WHITE);
/* 1268 */       panel_editar.txt_correo2.setBackground(Color.WHITE);
/* 1269 */       panel_editar.txt_telefono21.setBackground(Color.WHITE);
/* 1270 */       panel_editar.txt_telefono22.setBackground(Color.WHITE);
/* 1271 */       panel_editar.txt_telefono23.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1274 */       panel_editar.txt_contacto3.setBackground(Color.WHITE);
/* 1275 */       panel_editar.txt_cargo3.setBackground(Color.WHITE);
/* 1276 */       panel_editar.txt_celular3.setBackground(Color.WHITE);
/* 1277 */       panel_editar.txt_correo3.setBackground(Color.WHITE);
/* 1278 */       panel_editar.txt_telefono31.setBackground(Color.WHITE);
/* 1279 */       panel_editar.txt_telefono32.setBackground(Color.WHITE);
/* 1280 */       panel_editar.txt_telefono33.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1283 */       panel_editar.txt_contacto4.setBackground(Color.WHITE);
/* 1284 */       panel_editar.txt_cargo4.setBackground(Color.WHITE);
/* 1285 */       panel_editar.txt_celular4.setBackground(Color.WHITE);
/* 1286 */       panel_editar.txt_correo4.setBackground(Color.WHITE);
/* 1287 */       panel_editar.txt_telefono41.setBackground(Color.WHITE);
/* 1288 */       panel_editar.txt_telefono42.setBackground(Color.WHITE);
/* 1289 */       panel_editar.txt_telefono43.setBackground(Color.WHITE);
/*      */       
/* 1291 */       panel_editar.txt_contactofac.setBackground(Color.WHITE);
/* 1292 */       panel_editar.txt_correofac.setBackground(Color.WHITE);
/*      */       
/* 1294 */       panel_editar.check_nit.setBackground(Color.WHITE);
/* 1295 */       panel_editar.check_nit.setForeground(Color.BLACK);
/* 1296 */       panel_editar.check_nombre.setBackground(Color.WHITE);
/* 1297 */       panel_editar.check_nombre.setForeground(Color.BLACK);
/*      */ 
/*      */ 
/*      */       
/* 1301 */       panel_editar.txt_razon.setForeground(Color.BLACK);
/* 1302 */       panel_editar.txt_ciudad.setForeground(Color.BLACK);
/* 1303 */       panel_editar.txt_direccion.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1306 */       panel_editar.txt_contacto1.setForeground(Color.BLACK);
/* 1307 */       panel_editar.txt_cargo1.setForeground(Color.BLACK);
/* 1308 */       panel_editar.txt_celular1.setForeground(Color.BLACK);
/* 1309 */       panel_editar.txt_correo1.setForeground(Color.BLACK);
/* 1310 */       panel_editar.txt_telefono11.setForeground(Color.BLACK);
/* 1311 */       panel_editar.txt_telefono12.setForeground(Color.BLACK);
/* 1312 */       panel_editar.txt_telefono12.setForeground(Color.BLACK);
/*      */       
/* 1314 */       panel_editar.txt_contacto2.setForeground(Color.BLACK);
/* 1315 */       panel_editar.txt_cargo2.setForeground(Color.BLACK);
/* 1316 */       panel_editar.txt_celular2.setForeground(Color.BLACK);
/* 1317 */       panel_editar.txt_correo2.setForeground(Color.BLACK);
/* 1318 */       panel_editar.txt_telefono21.setForeground(Color.BLACK);
/* 1319 */       panel_editar.txt_telefono22.setForeground(Color.BLACK);
/* 1320 */       panel_editar.txt_telefono23.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1323 */       panel_editar.txt_contacto3.setForeground(Color.BLACK);
/* 1324 */       panel_editar.txt_cargo3.setForeground(Color.BLACK);
/* 1325 */       panel_editar.txt_celular3.setForeground(Color.BLACK);
/* 1326 */       panel_editar.txt_correo3.setForeground(Color.BLACK);
/* 1327 */       panel_editar.txt_telefono31.setForeground(Color.BLACK);
/* 1328 */       panel_editar.txt_telefono32.setForeground(Color.BLACK);
/* 1329 */       panel_editar.txt_telefono33.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1332 */       panel_editar.txt_contacto4.setForeground(Color.BLACK);
/* 1333 */       panel_editar.txt_cargo4.setForeground(Color.BLACK);
/* 1334 */       panel_editar.txt_celular4.setForeground(Color.BLACK);
/* 1335 */       panel_editar.txt_correo4.setForeground(Color.BLACK);
/* 1336 */       panel_editar.txt_telefono41.setForeground(Color.BLACK);
/* 1337 */       panel_editar.txt_telefono42.setForeground(Color.BLACK);
/* 1338 */       panel_editar.txt_telefono43.setForeground(Color.BLACK);
/*      */       
/* 1340 */       panel_editar.txt_contactofac.setForeground(Color.BLACK);
/* 1341 */       panel_editar.txt_correofac.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1344 */       panel_editar.label_razon.setForeground(Color.BLACK);
/* 1345 */       panel_editar.label_ciudad.setForeground(Color.BLACK);
/* 1346 */       panel_editar.label_direccion.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1349 */       panel_editar.label_contacto1.setForeground(Color.BLACK);
/* 1350 */       panel_editar.label_cargo1.setForeground(Color.BLACK);
/* 1351 */       panel_editar.label_celular1.setForeground(Color.BLACK);
/* 1352 */       panel_editar.label_correo1.setForeground(Color.BLACK);
/* 1353 */       panel_editar.label_telefono11.setForeground(Color.BLACK);
/* 1354 */       panel_editar.label_telefono12.setForeground(Color.BLACK);
/* 1355 */       panel_editar.label_telefono13.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1358 */       panel_editar.label_contacto2.setForeground(Color.BLACK);
/* 1359 */       panel_editar.label_cargo2.setForeground(Color.BLACK);
/* 1360 */       panel_editar.label_celular2.setForeground(Color.BLACK);
/* 1361 */       panel_editar.label_correo2.setForeground(Color.BLACK);
/* 1362 */       panel_editar.label_telefono21.setForeground(Color.BLACK);
/* 1363 */       panel_editar.label_telefono22.setForeground(Color.BLACK);
/* 1364 */       panel_editar.label_telefono23.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1367 */       panel_editar.label_contacto3.setForeground(Color.BLACK);
/* 1368 */       panel_editar.label_cargo3.setForeground(Color.BLACK);
/* 1369 */       panel_editar.label_celular3.setForeground(Color.BLACK);
/* 1370 */       panel_editar.label_correo3.setForeground(Color.BLACK);
/* 1371 */       panel_editar.label_telefono31.setForeground(Color.BLACK);
/* 1372 */       panel_editar.label_telefono32.setForeground(Color.BLACK);
/* 1373 */       panel_editar.label_telefono33.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1376 */       panel_editar.label_contacto4.setForeground(Color.BLACK);
/* 1377 */       panel_editar.label_cargo4.setForeground(Color.BLACK);
/* 1378 */       panel_editar.label_celular4.setForeground(Color.BLACK);
/* 1379 */       panel_editar.label_correo4.setForeground(Color.BLACK);
/* 1380 */       panel_editar.label_telefono41.setForeground(Color.BLACK);
/* 1381 */       panel_editar.label_telefono42.setForeground(Color.BLACK);
/* 1382 */       panel_editar.label_telefono43.setForeground(Color.BLACK);
/*      */       
/* 1384 */       panel_editar.label_contactofac.setForeground(Color.BLACK);
/* 1385 */       panel_editar.label_correofac.setForeground(Color.BLACK);
/* 1386 */       panel_editar.label_seleccione.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1389 */       panel_editar.boton_consultar.setBackground(Color.WHITE);
/* 1390 */       panel_editar.boton_limpiar.setBackground(Color.WHITE);
/* 1391 */       panel_editar.boton_cambios.setBackground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void light_registrar() {
/* 1396 */     if (this.check_light.isSelected() == true) {
/*      */       
/* 1398 */       ImageIcon wallpaper2 = new ImageIcon("src/images/fondoblanco2.png");
/* 1399 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1360, 710, 1));
/*      */       
/* 1401 */       panel_registrar.label_fondo.setIcon(icono2);
/*      */ 
/*      */       
/* 1404 */       repaint();
/* 1405 */       this.contenedor.revalidate();
/* 1406 */       this.contenedor.repaint();
/*      */       
/* 1408 */       panel_registrar.txt_nit.setBackground(Color.WHITE);
/* 1409 */       panel_registrar.txt_nombre.setBackground(Color.WHITE);
/* 1410 */       panel_registrar.txt_razon.setBackground(Color.WHITE);
/* 1411 */       panel_registrar.txt_ciudad.setBackground(Color.WHITE);
/* 1412 */       panel_registrar.txt_direccion.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1415 */       panel_registrar.txt_contacto1.setBackground(Color.WHITE);
/* 1416 */       panel_registrar.txt_cargo1.setBackground(Color.WHITE);
/* 1417 */       panel_registrar.txt_celular1.setBackground(Color.WHITE);
/* 1418 */       panel_registrar.txt_correo1.setBackground(Color.WHITE);
/* 1419 */       panel_registrar.txt_telefono11.setBackground(Color.WHITE);
/* 1420 */       panel_registrar.txt_telefono12.setBackground(Color.WHITE);
/* 1421 */       panel_registrar.txt_telefono13.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1424 */       panel_registrar.txt_contacto2.setBackground(Color.WHITE);
/* 1425 */       panel_registrar.txt_cargo2.setBackground(Color.WHITE);
/* 1426 */       panel_registrar.txt_celular2.setBackground(Color.WHITE);
/* 1427 */       panel_registrar.txt_correo2.setBackground(Color.WHITE);
/* 1428 */       panel_registrar.txt_telefono21.setBackground(Color.WHITE);
/* 1429 */       panel_registrar.txt_telefono22.setBackground(Color.WHITE);
/* 1430 */       panel_registrar.txt_telefono23.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1433 */       panel_registrar.txt_contacto3.setBackground(Color.WHITE);
/* 1434 */       panel_registrar.txt_cargo3.setBackground(Color.WHITE);
/* 1435 */       panel_registrar.txt_celular3.setBackground(Color.WHITE);
/* 1436 */       panel_registrar.txt_correo3.setBackground(Color.WHITE);
/* 1437 */       panel_registrar.txt_telefono31.setBackground(Color.WHITE);
/* 1438 */       panel_registrar.txt_telefono32.setBackground(Color.WHITE);
/* 1439 */       panel_registrar.txt_telefono33.setBackground(Color.WHITE);
/*      */ 
/*      */       
/* 1442 */       panel_registrar.txt_contacto4.setBackground(Color.WHITE);
/* 1443 */       panel_registrar.txt_cargo4.setBackground(Color.WHITE);
/* 1444 */       panel_registrar.txt_celular4.setBackground(Color.WHITE);
/* 1445 */       panel_registrar.txt_correo4.setBackground(Color.WHITE);
/* 1446 */       panel_registrar.txt_telefono41.setBackground(Color.WHITE);
/* 1447 */       panel_registrar.txt_telefono42.setBackground(Color.WHITE);
/* 1448 */       panel_registrar.txt_telefono43.setBackground(Color.WHITE);
/*      */       
/* 1450 */       panel_registrar.txt_contactofac.setBackground(Color.WHITE);
/* 1451 */       panel_registrar.txt_correofac.setBackground(Color.WHITE);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1456 */       panel_registrar.txt_nit.setForeground(Color.BLACK);
/* 1457 */       panel_registrar.txt_nombre.setForeground(Color.BLACK);
/* 1458 */       panel_registrar.txt_razon.setForeground(Color.BLACK);
/* 1459 */       panel_registrar.txt_ciudad.setForeground(Color.BLACK);
/* 1460 */       panel_registrar.txt_direccion.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1463 */       panel_registrar.txt_contacto1.setForeground(Color.BLACK);
/* 1464 */       panel_registrar.txt_cargo1.setForeground(Color.BLACK);
/* 1465 */       panel_registrar.txt_celular1.setForeground(Color.BLACK);
/* 1466 */       panel_registrar.txt_correo1.setForeground(Color.BLACK);
/* 1467 */       panel_registrar.txt_telefono11.setForeground(Color.BLACK);
/* 1468 */       panel_registrar.txt_telefono12.setForeground(Color.BLACK);
/* 1469 */       panel_registrar.txt_telefono12.setForeground(Color.BLACK);
/*      */       
/* 1471 */       panel_registrar.txt_contacto2.setForeground(Color.BLACK);
/* 1472 */       panel_registrar.txt_cargo2.setForeground(Color.BLACK);
/* 1473 */       panel_registrar.txt_celular2.setForeground(Color.BLACK);
/* 1474 */       panel_registrar.txt_correo2.setForeground(Color.BLACK);
/* 1475 */       panel_registrar.txt_telefono21.setForeground(Color.BLACK);
/* 1476 */       panel_registrar.txt_telefono22.setForeground(Color.BLACK);
/* 1477 */       panel_registrar.txt_telefono23.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1480 */       panel_registrar.txt_contacto3.setForeground(Color.BLACK);
/* 1481 */       panel_registrar.txt_cargo3.setForeground(Color.BLACK);
/* 1482 */       panel_registrar.txt_celular3.setForeground(Color.BLACK);
/* 1483 */       panel_registrar.txt_correo3.setForeground(Color.BLACK);
/* 1484 */       panel_registrar.txt_telefono31.setForeground(Color.BLACK);
/* 1485 */       panel_registrar.txt_telefono32.setForeground(Color.BLACK);
/* 1486 */       panel_registrar.txt_telefono33.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1489 */       panel_registrar.txt_contacto4.setForeground(Color.BLACK);
/* 1490 */       panel_registrar.txt_cargo4.setForeground(Color.BLACK);
/* 1491 */       panel_registrar.txt_celular4.setForeground(Color.BLACK);
/* 1492 */       panel_registrar.txt_correo4.setForeground(Color.BLACK);
/* 1493 */       panel_registrar.txt_telefono41.setForeground(Color.BLACK);
/* 1494 */       panel_registrar.txt_telefono42.setForeground(Color.BLACK);
/* 1495 */       panel_registrar.txt_telefono43.setForeground(Color.BLACK);
/*      */       
/* 1497 */       panel_registrar.txt_contactofac.setForeground(Color.BLACK);
/* 1498 */       panel_registrar.txt_correofac.setForeground(Color.BLACK);
/*      */ 
/*      */ 
/*      */ 
/*      */       
/* 1503 */       panel_registrar.label_nit.setForeground(Color.BLACK);
/* 1504 */       panel_registrar.label_nombre.setForeground(Color.BLACK);
/* 1505 */       panel_registrar.label_razon.setForeground(Color.BLACK);
/* 1506 */       panel_registrar.label_ciudad.setForeground(Color.BLACK);
/* 1507 */       panel_registrar.label_direccion.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1510 */       panel_registrar.label_contacto1.setForeground(Color.BLACK);
/* 1511 */       panel_registrar.label_cargo1.setForeground(Color.BLACK);
/* 1512 */       panel_registrar.label_celular1.setForeground(Color.BLACK);
/* 1513 */       panel_registrar.label_correo1.setForeground(Color.BLACK);
/* 1514 */       panel_registrar.label_telefono11.setForeground(Color.BLACK);
/* 1515 */       panel_registrar.label_telefono12.setForeground(Color.BLACK);
/* 1516 */       panel_registrar.label_telefono13.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1519 */       panel_registrar.label_contacto2.setForeground(Color.BLACK);
/* 1520 */       panel_registrar.label_cargo2.setForeground(Color.BLACK);
/* 1521 */       panel_registrar.label_celular2.setForeground(Color.BLACK);
/* 1522 */       panel_registrar.label_correo2.setForeground(Color.BLACK);
/* 1523 */       panel_registrar.label_telefono21.setForeground(Color.BLACK);
/* 1524 */       panel_registrar.label_telefono22.setForeground(Color.BLACK);
/* 1525 */       panel_registrar.label_telefono23.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1528 */       panel_registrar.label_contacto3.setForeground(Color.BLACK);
/* 1529 */       panel_registrar.label_cargo3.setForeground(Color.BLACK);
/* 1530 */       panel_registrar.label_celular3.setForeground(Color.BLACK);
/* 1531 */       panel_registrar.label_correo3.setForeground(Color.BLACK);
/* 1532 */       panel_registrar.label_telefono31.setForeground(Color.BLACK);
/* 1533 */       panel_registrar.label_telefono32.setForeground(Color.BLACK);
/* 1534 */       panel_registrar.label_telefono33.setForeground(Color.BLACK);
/*      */ 
/*      */       
/* 1537 */       panel_registrar.label_contacto4.setForeground(Color.BLACK);
/* 1538 */       panel_registrar.label_cargo4.setForeground(Color.BLACK);
/* 1539 */       panel_registrar.label_celular4.setForeground(Color.BLACK);
/* 1540 */       panel_registrar.label_correo4.setForeground(Color.BLACK);
/* 1541 */       panel_registrar.label_telefono41.setForeground(Color.BLACK);
/* 1542 */       panel_registrar.label_telefono42.setForeground(Color.BLACK);
/* 1543 */       panel_registrar.label_telefono43.setForeground(Color.BLACK);
/*      */       
/* 1545 */       panel_registrar.label_contactofac.setForeground(Color.BLACK);
/* 1546 */       panel_registrar.label_correofac.setForeground(Color.BLACK);
/* 1547 */       panel_registrar.label_seleccione.setForeground(Color.BLACK);
/*      */ 
/*      */ 
/*      */       
/* 1551 */       panel_registrar.boton_registrar.setBackground(Color.WHITE);
/* 1552 */       panel_registrar.boton_limpiar.setBackground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */   
/*      */   public void light_eliminar() {
/* 1557 */     if (this.check_light.isSelected() == true) {
/*      */       
/* 1559 */       ImageIcon wallpaper2 = new ImageIcon("src/images/fondoblanco2.png");
/* 1560 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1360, 710, 1));
/*      */       
/* 1562 */       panel_eliminar.label_fondo.setIcon(icono2);
/*      */ 
/*      */       
/* 1565 */       repaint();
/* 1566 */       this.contenedor.revalidate();
/* 1567 */       this.contenedor.repaint();
/* 1568 */       panel_eliminar.check_nit.setBackground(Color.WHITE);
/* 1569 */       panel_eliminar.check_nit.setForeground(Color.BLACK);
/* 1570 */       panel_eliminar.check_nombre.setBackground(Color.WHITE);
/* 1571 */       panel_eliminar.check_nombre.setForeground(Color.BLACK);
/*      */       
/* 1573 */       panel_eliminar.label_seleccione.setForeground(Color.BLACK);
/*      */       
/* 1575 */       panel_eliminar.boton_eliminar.setBackground(Color.WHITE);
/* 1576 */       panel_eliminar.boton_limpiar.setBackground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void fondo_bienvenida() {
/* 1584 */     this.bi.setSize(1210, 700);
/* 1585 */     this.bi.setLocation(0, 0);
/* 1586 */     this.contenedor.removeAll();
/*      */     
/* 1588 */     this.contenedor.add(this.bi, "Center");
/* 1589 */     this.contenedor.revalidate();
/* 1590 */     this.contenedor.repaint();
/*      */     
/* 1592 */     if (this.bi.isEnabled() == true && this.check_dark.isSelected() == true) {
/* 1593 */       ImageIcon wallpaper2 = new ImageIcon("src/images/herratecfonfonegro.png");
/* 1594 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1210, 710, 1));
/* 1595 */       panel_bienvenida.label_fondo.setIcon(icono2);
/* 1596 */       repaint();
/*      */     } 
/*      */     
/* 1599 */     if (this.bi.isEnabled() == true && this.check_light.isSelected() == true) {
/* 1600 */       ImageIcon wallpaper2 = new ImageIcon("src/images/herratecfondo.png");
/* 1601 */       Icon icono2 = new ImageIcon(wallpaper2.getImage().getScaledInstance(1210, 710, 1));
/* 1602 */       panel_bienvenida.label_fondo.setIcon(icono2);
/* 1603 */       repaint();
/*      */     } 
/*      */   }
/*      */ 
/*      */   
/*      */   public void dark_frame() {
/* 1609 */     if (this.check_dark.isSelected() == true) {
/* 1610 */       this.txt_consultar.setBackground(Color.BLACK);
/* 1611 */       this.txt_registrar.setBackground(Color.BLACK);
/* 1612 */       this.txt_editar.setBackground(Color.BLACK);
/* 1613 */       this.txt_eliminar.setBackground(Color.BLACK);
/*      */       
/* 1615 */       this.txt_consultar.setForeground(Color.WHITE);
/* 1616 */       this.txt_registrar.setForeground(Color.WHITE);
/* 1617 */       this.txt_editar.setForeground(Color.WHITE);
/* 1618 */       this.txt_eliminar.setForeground(Color.WHITE);
/*      */       
/* 1620 */       boton_consultar.setBackground(Color.BLACK);
/* 1621 */       this.boton_registrar.setBackground(Color.BLACK);
/* 1622 */       this.boton_editar.setBackground(Color.BLACK);
/* 1623 */       this.boton_eliminar.setBackground(Color.BLACK);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void light_frame() {
/* 1633 */     if (this.check_light.isSelected() == true) {
/* 1634 */       this.txt_consultar.setBackground(Color.WHITE);
/* 1635 */       this.txt_registrar.setBackground(Color.WHITE);
/* 1636 */       this.txt_editar.setBackground(Color.WHITE);
/* 1637 */       this.txt_eliminar.setBackground(Color.WHITE);
/*      */       
/* 1639 */       this.txt_consultar.setForeground(Color.BLACK);
/* 1640 */       this.txt_registrar.setForeground(Color.BLACK);
/* 1641 */       this.txt_editar.setForeground(Color.BLACK);
/* 1642 */       this.txt_eliminar.setForeground(Color.BLACK);
/*      */       
/* 1644 */       boton_consultar.setBackground(Color.WHITE);
/* 1645 */       this.boton_registrar.setBackground(Color.WHITE);
/* 1646 */       this.boton_editar.setBackground(Color.WHITE);
/* 1647 */       this.boton_eliminar.setBackground(Color.WHITE);
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void main(String[] args) {
/*      */     try {
/* 1662 */       for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
/* 1663 */         if ("Nimbus".equals(info.getName())) {
/* 1664 */           UIManager.setLookAndFeel(info.getClassName());
/*      */           break;
/*      */         } 
/*      */       } 
/* 1668 */     } catch (ClassNotFoundException ex) {
/* 1669 */       Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1670 */     } catch (InstantiationException ex) {
/* 1671 */       Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1672 */     } catch (IllegalAccessException ex) {
/* 1673 */       Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, ex);
/* 1674 */     } catch (UnsupportedLookAndFeelException ex) {
/* 1675 */       Logger.getLogger(principal.class.getName()).log(Level.SEVERE, (String)null, ex);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/* 1680 */     EventQueue.invokeLater(new Runnable() {
/*      */           public void run() {
/* 1682 */             (new principal()).setVisible(true);
/*      */           }
/*      */         });
/*      */   }
/*      */ }


/* Location:              C:\Users\David\Desktop\Programa_cliente\Programa\dist\Sistema de gestion de clientes.jar!\sistema_de_gestion_de_clientes_excel\principal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */