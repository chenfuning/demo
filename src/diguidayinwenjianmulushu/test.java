package diguidayinwenjianmulushu;

import java.io.File;
/**
 * �ݹ��ӡ�ļ�Ŀ¼��
 * @author ning
 *
 */
public class test {

	public static void main(String[] args) {
		File f=new File("D:\\�ʼ�����");
		printFile(f,0);
	}
	static void printFile(File file,int level) {
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		//�������Ŀ¼
		if(file.isDirectory()) {
			//��ȡfileĿ¼�µ��������ļ�
			File[] files=file.listFiles();
			for(File temp:files) {
				printFile(temp,level+1);
			}
		}
	}

}
