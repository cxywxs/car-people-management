package test_for_project;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;

public class JListDemo1 extends JFrame
{
    public JListDemo1()
    {
        setTitle("Java�б�����ʾ��");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //���ô����˳�ʱ����
        setBounds(100,100,300,200);    //���ô���λ�úʹ�С
        JPanel contentPane=new JPanel();    //�����������
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));    //�������ı߿�
        contentPane.setLayout(new BorderLayout(0, 0));    //�����������Ϊ�߽粼��
        setContentPane(contentPane);    //Ӧ���������
        JScrollPane scrollPane=new JScrollPane();    //�����������
        contentPane.add(scrollPane,BorderLayout.CENTER);    //��������ӵ��߽粼������
        JList list=new JList();
        //����ֻ��ѡ��һ��Ԫ��
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane.setViewportView(list);    //�ڹ����������ʾ�б�
        String[] listData=new String[12];    //����һ������12��Ԫ�ص�����
        for (int i=0;i<listData.length;i++)
        {
            listData[i]="�����б��ĵ�"+(i+1)+"��Ԫ��~";    //Ϊ�����и���Ԫ�ظ�ֵ
        }
        list.setListData(listData);    //Ϊ�б��������
    }
    public static void main(String[] args)
    {
        JListDemo1 frame=new JListDemo1();
        frame.setVisible(true);
    }
}