import java.io.File;

/**
 * @author Archer
 *
 * 文件夹的创建，重命名和删除
 */
public class HelloFolder {
    public static void main(String[] args) {
/**
 * 当创建多级文件夹的文件，并且缺失路径的情况下，使用mkdirs函数，返回一个布尔类型的
 */
//        File folder=new File("MyFolder/one/two/three/main");
//       if (folder.mkdirs()){
//
//           System.out.println("文件夹创建完成");
//
//       }else{
//
//           if (folder.exists()){
//               System.out.println("文件夹已经创建");
//           }else{
//               System.out.println("文件夹创建失败");
//
//           }
//
//       }

        //处于同一分区之中。
        File folder=new File("new Folder/one");
//        File  newFolder=new File("new Folder/three");
//
//        if (folder.renameTo(newFolder)){
//            System.out.println("done");
//        }else{
//            System.out.println("fail");
//        }
        /**
         * 调用delete方法的时候，必须保证文件夹为空
         */
        if (folder.delete()){
            System.out.println("done");

        }else {
            System.out.println("fail");
        }

    }
}
