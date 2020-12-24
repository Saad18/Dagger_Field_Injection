package com.saad.dagger_field_injection;

import dagger.Component;
@Component
public interface CarComponent {


    void inject(MainActivity mainActivity);
}
