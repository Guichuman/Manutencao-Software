package view;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Exercicio;
import model.Treino;
import model.Cliente;
import model.PlanoTreino;
import org.hibernate.Session;

/**
 *
 * @author vinicius
 */
public class IFrmPlanoTreino extends javax.swing.JInternalFrame {
    Treino treino;
    Cliente c;
    Exercicio exercicio;
    PlanoTreino planoTreino;
    ArrayList<Cliente> cliente;
    ArrayList<PlanoTreino> pt;
    private DefaultTableModel dtm;
    private int cont = 0;
    private int aux = 0;
    private int escolha;
    Session s;
    
    /**
     * Creates new form IFrmPlanoTreino
     * @param s
     */
    
    public IFrmPlanoTreino(Session s) {
        initComponents();
        this.s = s;
        Campos(false);
        dtm = (DefaultTableModel)tblPlanoTreino.getModel();
        escolha = -1;
    }
        
    public void Campos(boolean t){
        txtExercicio.setEnabled(t);
        txtObservacao.setEnabled(t);
        txtTreino.setEnabled(t);
        spnRepeticao.setEnabled(t);
        spnSerie.setEnabled(t);
        btnCadastrar.setEnabled(t);
        btnNovo.setEnabled(t);
        btnLimpar.setEnabled(t);
    }
    
    public void LimparCampos(){
        txtExercicio.setText("");
        spnSerie.setValue(1);
        spnRepeticao.setValue(1);
        txtObservacao.setText("");
    }
    
    public boolean CampoVazio(){
        if(txtTreino.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha o campo treino!");
            return false;
        }
        if(txtExercicio.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Preencha o campo exercicio!");
            return false; 
        }
        if(spnRepeticao.getValue().equals(0)){
            JOptionPane.showMessageDialog(this, "Preencha o campo repetição!");
            return false;
        }
        if(spnSerie.getValue().equals(0)){
            JOptionPane.showMessageDialog(this, "Preencha o campo serie!");
            return false;
        }
        return true;
    }
    
    private void atualizarTabela(PlanoTreino pt, int codigo){
        if (codigo == -1){
            dtm.addRow(pt.toRow());            
        }
        else{
            dtm.removeRow(codigo); 
            dtm.insertRow(codigo, c.toRow());
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTreino = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtExercicio = new javax.swing.JTextField();
        spnSerie = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spnRepeticao = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPlanoTreino = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        fTextCpf = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnNCliente = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Plano de Treino");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Plano de Treino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Treino", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel1.setText("Nome:");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar Campos");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo Treino");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTreino, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTreino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnLimpar)
                    .addComponent(btnNovo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Exercício", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        jLabel2.setText("Nome:");

        jLabel3.setText("Quantidade de séries:");

        spnSerie.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel4.setText("Quantidade de repetições:");

        spnRepeticao.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel5.setText("Observação:");

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnRepeticao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtExercicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(spnSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(spnRepeticao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblPlanoTreino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Treino", "Exercicio", "Qtd Repetições", "Qtd Séries", "Observação"
            }
        ));
        jScrollPane2.setViewportView(tblPlanoTreino);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        try {
            fTextCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("CPF :");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnNCliente.setText("Novo Cliente");
        btnNCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(fTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnNCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnNCliente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
                  
        if(cont == 0){
            treino = new Treino(txtTreino.getText());
            try{   
                s.beginTransaction();
                s.save(treino);
                s.getTransaction().commit();
                cont = 1;
                txtTreino.setEnabled(false);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
        }        
        cliente = (ArrayList<Cliente>) s.createQuery("From Cliente").list();  
        for(Cliente cl : cliente){
            if(cl.getCpfCliente().equals(fTextCpf.getText())){
                aux = 1;
                c = cl;
            }
        }
        if(aux == 1){
            Exercicio e = new Exercicio(txtExercicio.getText(),
                                    (int)spnSerie.getValue(),
                                    (int)spnRepeticao.getValue(),
                                    txtObservacao.getText());
            PlanoTreino pt = new PlanoTreino(c, e, treino);
                
                try{   
                    s.beginTransaction();
                    s.save(e);
                    s.save(pt);
                    s.getTransaction().commit();
                    JOptionPane.showMessageDialog(this, "Cadastrado!");
                    LimparCampos();
                    atualizarTabela(pt, escolha);
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(this, ex);
                }
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        cont = 0;
        txtTreino.setText("");
        fTextCpf.setEnabled(false);
        btnBuscar.setEnabled(false);
        Campos(true);
        LimparCampos();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        cliente = (ArrayList<Cliente>) s.createQuery("From Cliente").list();        
        int i = 0;
        for(Cliente cl : cliente){
            if(cl.getCpfCliente().equals(fTextCpf.getText())){
                fTextCpf.setEnabled(false);
                btnBuscar.setEnabled(false);
                Campos(true);
                i = 1;
                JOptionPane.showMessageDialog(this, "Será criado um Plano de Treino para: "+cl.getNomeCliente());
            }
        }
        if(i == 0){
            JOptionPane.showMessageDialog(this, "CPF não encontrado!!");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnNClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNClienteActionPerformed
        aux = 0;
        fTextCpf.setText("");
        txtTreino.setText("");
        fTextCpf.setEnabled(true);
        btnBuscar.setEnabled(true);
        Campos(false);
    }//GEN-LAST:event_btnNClienteActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnNCliente;
    private javax.swing.JButton btnNovo;
    private javax.swing.JFormattedTextField fTextCpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnRepeticao;
    private javax.swing.JSpinner spnSerie;
    private javax.swing.JTable tblPlanoTreino;
    private javax.swing.JTextField txtExercicio;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtTreino;
    // End of variables declaration//GEN-END:variables
}

/*if(cont == 0){
            treino = new Treino(idT, txtTreino.getText());
            
            try{   
                s.beginTransaction();
                s.save(treino);
                txtTreino.setEnabled(false);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }
            cont = 1;
        }
        
        exercicio = new Exercicio(idE, 
                                txtExercicio.getText(),
                                (int)spnSerie.getValue(),
                                (int)spnRepeticao.getValue(),
                                txtObservacao.getText());
        idE += 1;    
        planoTreino = new PlanoTreino(idpT, exercicio, treino);
        
        if(aux == 0){
            cliente = cliente = (ArrayList<Cliente>) s.createQuery("From Cliente").list();  
            for(Cliente cl : cliente){
                if(cl.getCpfCliente().equals(fTextCpf.getText())){
                    cl.setPlanoTreino(planoTreino);
                    try{   
                        s.update(cl); 
                        fTextCpf.setEnabled(false);
                        btnBuscar.setEnabled(false);
                        LimparCampos();
                    }catch(Exception ex){
                        JOptionPane.showMessageDialog(this, ex);
                    }
                    aux = 1;
                }
            }    
        }
        
        try{   
            s.save(exercicio);
            s.save(planoTreino);
            s.getTransaction().commit();
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");            
            Object[] dados = {txtTreino.getText(), 
                              txtExercicio.getText(),
                              spnSerie.getValue().toString(),
                              spnRepeticao.getValue().toString(),
                              txtObservacao.getText()};
                dtm.addRow(dados);
            LimparCampos();    
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, ex);
            }    */