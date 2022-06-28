package com.codeclan.workplaces.components;

import com.codeclan.workplaces.models.File;
import com.codeclan.workplaces.models.Folder;
import com.codeclan.workplaces.models.Person;
import com.codeclan.workplaces.repositories.FileRepository;
import com.codeclan.workplaces.repositories.FolderRepository;
import com.codeclan.workplaces.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.time.Period;

@Component
public class Seeds implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    PersonRepository personRepository;

    public Seeds() {
    }

    public void run(ApplicationArguments args) {

        Person dave = new Person("Dave");
        personRepository.save(dave);
        Person sally = new Person("Sally");
        personRepository.save(sally);
        Person gregg = new Person("Gregg");
        personRepository.save(gregg);

        Folder java = new Folder("Java_Projects", dave);
        folderRepository.save(java);
        Folder js = new Folder("JS_Projects", sally);
        folderRepository.save(js);
        Folder python = new Folder("Python_Projects", gregg);
        folderRepository.save(python);

        File file1 = new File("Interfaces", ".java", 18, java);
        fileRepository.save(file1);
        File file2 = new File("Abstraction", ".java", 12, java);
        fileRepository.save(file2);
        File file3 = new File("Chickens", ".py", 22, python);
        fileRepository.save(file3);
        File file4 = new File("React", ".js", 29, js);
        fileRepository.save(file4);

    }
}

