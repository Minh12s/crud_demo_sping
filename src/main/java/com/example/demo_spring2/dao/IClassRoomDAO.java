package com.example.demo_spring2.dao;

import com.example.demo_spring2.entity.ClassRoom;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClassRoomDAO {
    void saveClassRoom(ClassRoom classRoom);
    ClassRoom getClassRoomById(long id);
    Page<ClassRoom> getAllClassRooms(Pageable pageable);
    void deleteClassRoom(ClassRoom classRoom);
}

