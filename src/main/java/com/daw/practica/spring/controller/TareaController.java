package com.daw.practica.spring.controller;
import org.springframework.web.bind.annotation.*;
import com.daw.practica.spring.model.Tarea;

import java.util.ArrayList;
                import java.util.List;
              @RestController
              @RequestMapping("/api/tareas")
                public class TareaController {
                    private List<Tarea> tareas = new ArrayList<>();

                    public TareaController() {
                        tareas.add(new Tarea(1, "Tarea 1", true));
                        tareas.add(new Tarea(2, "Tarea 2", false));
                        tareas.add(new Tarea(3, "Tarea 3", false));
                    }
                    @GetMapping
                    public List<Tarea> getTareas() {
                        return tareas;
                    }

                    @GetMapping("/{id}")
                  public Tarea obtenerPorId(@PathVariable int id) {
                        return tareas.get(id);
                    }
                    @PostMapping
                  public Tarea crearTarea(@RequestBody Tarea nueva) {
                       tareas.add(nueva);
                        return nueva;
                    };

                    @DeleteMapping("/{id}")
                  public void eliminarTarea(@PathVariable Integer id ) {
                   tareas.remove(id);
                    }

                }