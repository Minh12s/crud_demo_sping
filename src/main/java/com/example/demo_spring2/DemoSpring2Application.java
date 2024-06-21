package com.example.demo_spring2;

import com.example.demo_spring2.dao.ClassRoomDAO;
import com.example.demo_spring2.entity.ClassRoom;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class DemoSpring2Application {
//
//    public static void main(String[] args) {
//        SpringApplication.run(DemoSpring2Application.class, args);
//    }
//
//    @Bean
//    public static CommandLineRunner commandLineRunner(ClassRoomDAO classRoomDAO, StudentDAO studentDAO) {
//        return args -> {
//            System.out.println("Starting operations...");
//
//            // Add a new class room
//            addNewClass(classRoomDAO);
//
//            // Get and display a class room by ID
//            getClassById(classRoomDAO);
//
//            // Edit a class room
//            editClassRoom(classRoomDAO);
//
//            // Delete a class room
//            deleteClassRoom(classRoomDAO);
//
//            // Add new students
//            addNewStudents(studentDAO, classRoomDAO);
//
//            // Edit a student
//            editStudent(studentDAO);
//
//            // Delete a student
//            deleteStudent(studentDAO);
//
//            System.out.println("Operations completed.");
//        };
//    }
//
//    private static void addNewClass(ClassRoomDAO classRoomDAO) {
//        ClassRoom classRoom = new ClassRoom();
//        classRoom.setClassName("12A1");
//        classRoom.setNumberMember(22);
//        classRoomDAO.saveClassRoom(classRoom);
//        System.out.println("Added new class room: " + classRoom);
//    }
//
//    private static void getClassById(ClassRoomDAO classRoomDAO) {
//        ClassRoom classRoom = classRoomDAO.getClassRoomById(1L); // Assuming ID 1 exists
//        System.out.println("Retrieved class room by ID: " + classRoom);
//    }
//
//    private static void editClassRoom(ClassRoomDAO classRoomDAO) {
//        ClassRoom classRoom = classRoomDAO.getClassRoomById(1L); // Assuming ID 1 exists
//        if (classRoom != null) {
//            classRoom.setClassName("12A2");
//            classRoom.setNumberMember(25);
//            classRoomDAO.editClassRoom(classRoom);
//            System.out.println("Edited class room: " + classRoom);
//        } else {
//            System.out.println("Class room with ID 1 not found.");
//        }
//    }
//
//    private static void deleteClassRoom(ClassRoomDAO classRoomDAO) {
//        classRoomDAO.deleteClassRoom(3L);
//        System.out.println("Deleted class room with ID ");
//    }
//
//    private static void addNewStudents(StudentDAO studentDAO, ClassRoomDAO classRoomDAO) {
//        // Get the class room for students
//        ClassRoom classRoom = classRoomDAO.getClassRoomById(4L); // Assuming ID 1 exists
//
//        // Create and save new students
//        Student student1 = new Student("student1@example.com", "John", "Doe", classRoom);
//        studentDAO.saveStudent(student1);
//        Student student2 = new Student("student2@example.com", "Jane", "Smith", classRoom);
//        studentDAO.saveStudent(student2);
//
//        System.out.println("Added new students: " + student1 + ", " + student2);
//    }
//
//    private static void editStudent(StudentDAO studentDAO) {
//        // Get a student to edit
//        Student student = studentDAO.getStudentById(1); // Assuming ID 1 exists
//
//        if (student != null) {
//            student.setFirstName("Updated Minh");
//            studentDAO.updateStudent(student);
//            System.out.println("Updated student: " + student);
//        } else {
//            System.out.println("Student with ID 1 not found.");
//        }
//    }
//
//    private static void deleteStudent(StudentDAO studentDAO) {
//        studentDAO.deleteStudent(2); // Assuming ID 2 exists
//        System.out.println("Deleted student with ID 2");
//    }
//}

@SpringBootApplication
public class DemoSpring2Application {
    public static void main(String[] args) {
        SpringApplication.run(DemoSpring2Application.class, args);
        System.out.println("Hello World!");

    }
    @Bean
    public CommandLineRunner commandLineRunner(ClassRoomDAO classRoomDAO) {
        return args -> {
            getClassById(classRoomDAO);
//			addNewClass(classRoomDAO);

        };
    }

    //	private static void addNewClass(ClassRoomDAO classRoomDAO) {
//		ClassRoom classRoom = new ClassRoom();
//		classRoom.setClass_name("A1");
//		classRoom.setNumber_member(20);
//		classRoomDAO.saveClassRoom(classRoom);
//	}
    private static void getClassById(ClassRoomDAO classRoomDAO) {
        ClassRoom classRoom = classRoomDAO.getClassRoomById(5);
        System.out.println(classRoom.toString());
    }


}