package my_project.model;

import KAGO_framework.control.SoundController;
import KAGO_framework.view.DrawTool;

public interface AnimableList<T> {

    void draw(DrawTool drawTool);

    void update(double dt);

    /**
     * Wird in AnimatedList aufgerufen
     */
    void deleteAnimation(double dt);

    /**
     * Wird in AnimatedList aufgerufen
     */
    void spawnAnimation(double dt);

    void setPrevious(T newPrevious);

    void setNext(T theNext);

    void changePointer();

    T getPrevious();

    T getNext();

    void sounds(SoundController soundController);

    boolean tryToDelete();

}
