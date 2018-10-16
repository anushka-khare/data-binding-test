package user;


import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Objects;

public class User {

    private ObservableField<String> firstName;
    private  ObservableField<String> lastName;

    public User(ObservableField<String> firstName, ObservableField<String> lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ObservableField<String> getFirstName() {
        return firstName;
    }

    public void setFirstName(ObservableField<String> firstName) {
        this.firstName = firstName;
    }

    public ObservableField<String> getLastName() {
        return lastName;
    }

    public void setLastName(ObservableField<String> lastName) {
        this.lastName = lastName;
    }

    public TextWatcher textWatcher=new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            if (!Objects.equals(firstName.get(), s.toString())) {
                firstName.set(s.toString());
            }
        }
    };
}
