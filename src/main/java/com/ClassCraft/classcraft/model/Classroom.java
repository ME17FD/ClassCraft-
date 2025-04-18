package com.ClassCraft.classcraft.model;

import jakarta.persistence.*;

@Entity
@Table(name = "classrooms")
public class Classroom {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    private Integer chairs;
    private Float area;
    
    @Column(name = "has_projector")
    private Boolean hasProjector;
    
    @Enumerated(EnumType.STRING)
    private ClassroomStatus status;
    
    private Integer floor;
    
    @Column(name = "x_coord")
    private Integer xCoord;
    
    @Column(name = "y_coord")
    private Integer yCoord;
    
    @ManyToOne
    @JoinColumn(name = "floor_id")
    private Floor floorEntity;
    
    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getChairs() { return chairs; }
    public void setChairs(Integer chairs) { this.chairs = chairs; }
    public Float getArea() { return area; }
    public void setArea(Float area) { this.area = area; }
    public Boolean getHasProjector() { return hasProjector; }
    public void setHasProjector(Boolean hasProjector) { this.hasProjector = hasProjector; }
    public ClassroomStatus getStatus() { return status; }
    public void setStatus(ClassroomStatus status) { this.status = status; }
    public Integer getFloor() { return floor; }
    public void setFloor(Integer floor) { this.floor = floor; }
    public Integer getXCoord() { return xCoord; }
    public void setXCoord(Integer xCoord) { this.xCoord = xCoord; }
    public Integer getYCoord() { return yCoord; }
    public void setYCoord(Integer yCoord) { this.yCoord = yCoord; }
    public Floor getFloorEntity() { return floorEntity; }
    public void setFloorEntity(Floor floorEntity) { this.floorEntity = floorEntity; }
}