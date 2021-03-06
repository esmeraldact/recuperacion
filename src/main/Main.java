package main;

import controllers.ControllerBlocDeNotas;
import controllers.ControllerMayor;
import controllers.ControllerOrdenar;
import controllers.ControllerOperaciones;
import controllers.ControllerPrincipal;
import models.ModelBlocDeNotas;
import models.ModelMayor;
import models.ModelOrdenar;
import models.ModelOperaciones;
import models.ModelPrincipal;
import views.ViewBlocDeNotas;
import views.ViewMayor;
import views.ViewOrdenar;
import views.ViewOperaciones;
import views.ViewPrincipal;

public class Main {
    
    public static void main(String ect[]){
        ModelMayor model_mayor = new ModelMayor();
        ViewMayor view_mayor = new ViewMayor();
        ControllerMayor controller_mayor = new ControllerMayor(model_mayor,view_mayor);
        
        ModelOrdenar model_ordenar = new ModelOrdenar();
        ViewOrdenar view_ordenar = new ViewOrdenar();
        ControllerOrdenar controller_ordenar = new ControllerOrdenar(model_ordenar,view_ordenar);
        
        ModelOperaciones model_operaciones = new ModelOperaciones();
        ViewOperaciones view_operaciones = new ViewOperaciones();
        ControllerOperaciones controller_operaciones = new ControllerOperaciones(model_operaciones,view_operaciones);
        
        ModelBlocDeNotas model_bloc_de_notas = new ModelBlocDeNotas();
        ViewBlocDeNotas view_bloc_de_notas = new ViewBlocDeNotas();
        ControllerBlocDeNotas controller_bloc_de_notas = new ControllerBlocDeNotas(model_bloc_de_notas,view_bloc_de_notas);
        
        ModelPrincipal model_principal = new ModelPrincipal();
        ViewPrincipal view_principal = new ViewPrincipal();
        Object views[] = new Object[5];
        views[0]=view_mayor;
        views[1]=view_ordenar;
        views[2]=view_operaciones;
        views[3]=view_bloc_de_notas;
        views[4]=view_principal;
        ControllerPrincipal controller_principal = new ControllerPrincipal(model_principal,views);
    }
}
