package org.example.SS01.bai2;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class PlaySession {
    private double playTime = 0;

    public void addTime(double time) {
        this.playTime += time;
    }

    public double getPlayTime() {
        return playTime;
    }
}