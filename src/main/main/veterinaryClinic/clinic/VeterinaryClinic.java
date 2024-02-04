package main.veterinaryClinic.clinic;

import main.clients.pets.Animal;
import main.veterinaryClinic.colleague.Worker;

import java.util.ArrayList;
import java.util.List;

import static main.clients.pets.Animal.*;

public class VeterinaryClinic {
   protected List<Worker> worker;
   protected List<Animal>patiens;

//   public void addEmployee(Worker.employee) {
//      worker.add(employee);
//   }
//   public void addPatient(Animal.patient) {
//      patiens.add(patient);
//   }



   public List<Animal> getPatiens() {
      return patiens;
         }

   public List<Worker> getWorker() {
      return worker;
   }

   public VeterinaryClinic() {
      this.worker = new ArrayList<>();
      this.patiens=new ArrayList<>();

      }

   public void addEmployee(Worker w) {

   }
}


