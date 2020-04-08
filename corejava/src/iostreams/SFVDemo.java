package iostreams;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ProcessFiles extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file , BasicFileAttributes attr) {
		if(file.toString().endsWith(".java"))
			System.out.println(file);
		return FileVisitResult.CONTINUE;
	}
}


public class SFVDemo {

	public static void main(String[] args)throws IOException {
		Path p= Paths.get("D:\\GitRepo\\javase\\src");
		Files.walkFileTree(p, new ProcessFiles());
	}

}
