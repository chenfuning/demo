package diguidayinwenjianmulushu;

import java.io.File;
/**
 * 递归打印文件目录树
 * @author ning
 *
 */
public class test {

	public static void main(String[] args) {
		File f=new File("D:\\笔记中心");
		printFile(f,0);
	}
	static void printFile(File file,int level) {
		for(int i=0;i<level;i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		//如果它是目录
		if(file.isDirectory()) {
			//获取file目录下的所有子文件
			File[] files=file.listFiles();
			for(File temp:files) {
				printFile(temp,level+1);
			}
		}
	}

}
