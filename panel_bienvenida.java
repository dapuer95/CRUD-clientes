/*    */ package sistema_de_gestion_de_clientes_excel;
/*    */ 
/*    */ import javax.swing.GroupLayout;
/*    */ import javax.swing.JLabel;
/*    */ import javax.swing.JPanel;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class panel_bienvenida
/*    */   extends JPanel
/*    */ {
/*    */   public static JLabel label_fondo;
/*    */   
/*    */   public panel_bienvenida() {
/* 18 */     initComponents();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private void initComponents() {
/* 30 */     label_fondo = new JLabel();
/*    */     
/* 32 */     GroupLayout layout = new GroupLayout(this);
/* 33 */     setLayout(layout);
/* 34 */     layout.setHorizontalGroup(layout
/* 35 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 36 */         .addGroup(layout.createSequentialGroup()
/* 37 */           .addComponent(label_fondo, -2, 1213, -2)
/* 38 */           .addGap(0, 147, 32767)));
/*    */     
/* 40 */     layout.setVerticalGroup(layout
/* 41 */         .createParallelGroup(GroupLayout.Alignment.LEADING)
/* 42 */         .addGroup(layout.createSequentialGroup()
/* 43 */           .addComponent(label_fondo, -2, 710, -2)
/* 44 */           .addGap(0, 0, 32767)));
/*    */   }
/*    */ }


/* Location:              C:\Users\David\Desktop\Programa_cliente\Programa\dist\Sistema de gestion de clientes.jar!\sistema_de_gestion_de_clientes_excel\panel_bienvenida.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */