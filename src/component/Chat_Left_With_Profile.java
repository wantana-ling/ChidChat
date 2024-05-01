
package component;

import java.awt.Color;
import javax.swing.Icon;


public class Chat_Left_With_Profile extends javax.swing.JLayeredPane {

   
    public Chat_Left_With_Profile() {
        initComponents();
        txt.setBackground(new Color(239,239,239));
    }
    
    public void setUserProfile(String user){
        txt.setUserProfile(user);
    }

    public void setImageProfile(Icon image){
        lalimage.setImage(image);
    }
    public void setText(String text){
        if (text.equals("")){
            txt.hideText();
        }
        else {
            txt.setText(text);
        }
    }
    
    public void setImage(Icon... image){
        // txt.setImage(false, image);
       //   Update next
    }
    
     public void setImage(String... image){
        // txt.setImage(false, image);
    }
    
     public void setFile(String fileName, String fileSize) {
         txt.setFile(fileName, fileSize);
     }
    public void setTime(){
        txt.setTime("10:30 PM");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lalimage = new swing.ImageAvatar();
        txt = new component.Chat_Item();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.LINE_AXIS));

        lalimage.setBorderSize(0);
        lalimage.setFocusTraversalPolicyProvider(true);
        lalimage.setImage(new javax.swing.ImageIcon(getClass().getResource("/icon/testing/nobara-kugisaki-jujutsu-kaisen.gif"))); // NOI18N
        lalimage.setMaximumSize(new java.awt.Dimension(31, 31));
        lalimage.setMinimumSize(new java.awt.Dimension(31, 31));
        lalimage.setPreferredSize(new java.awt.Dimension(31, 31));

        jLayeredPane1.setLayer(lalimage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(lalimage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lalimage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jLayeredPane1);
        add(txt);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private swing.ImageAvatar lalimage;
    private component.Chat_Item txt;
    // End of variables declaration//GEN-END:variables
}
