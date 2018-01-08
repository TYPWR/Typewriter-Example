//
//  UserModel.java
//  Autogenerated by typewriter
//
//  Generation Date On 2018/01/08
//  Version: 1.0.0

package com.typewriter_java.model;

import com.typewriter_java.prototype.ClothesProto;
import com.typewriter_java.prototype.HouseProto;
import com.typewriter_java.prototype.PetProto;
import com.typewriter_java.prototype.UserProto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Date;

public class UserModel extends TypewriterBaseModel implements Serializable {
    public String objectId;
    public final String name;
    public final String favouriteSport;
    public final String favouriteMovie;
    public final boolean hasMarried;
    public final EducationLevel education;
    public final int age;
    public final int psychologicalAge;
    public final Date birthDate;
    public final PhoneModel phone;
    public final PetModel pet;
    public final List<HouseModel> houses;
    public final Map<String, List<Map<String, Map<String, ClothesModel>>>> wardrobes;
    @SuppressWarnings("unchecked")
    public UserModel(UserProto prototype, String objectId) {
        this.objectId = objectId;
        this.name = prototype.userName;
        this.favouriteSport = prototype.favouriteSport;
        this.favouriteMovie = prototype.favouriteMovie;
        this.hasMarried = prototype.hasMarried;
        this.age = prototype.age;
        this.psychologicalAge = prototype.psychologicalAge;
        this.birthDate = prototype.birthDate;
        this.education = EducationLevel.fromJSONString(prototype.educationEnum);
        this.pet = (PetModel)transformModelFromPrototype(prototype.pet);
        this.houses = (List<HouseModel>)transformModelFromPrototype(prototype.ownHouses);
        this.wardrobes = (Map<String, List<Map<String, Map<String, ClothesModel>>>>)transformModelFromPrototype(prototype.wardrobes);
        this.phone = PhoneModel.modelWithJSON(prototype.phone, objectId);
        UserModel.unidirectionalDataflow(this, this.objectId);
    }
    public Object transformModelFromPrototype(Object prototype) {
        if (prototype == null) {
            return null;
        }
        if (prototype instanceof PetProto) {
            return new PetModel((PetProto)prototype);
        }
        if (prototype instanceof HouseProto) {
            return new HouseModel((HouseProto)prototype);
        }
        if (prototype instanceof ClothesProto) {
            return new ClothesModel((ClothesProto)prototype, this.objectId);
        }
        return super.transformModelFromPrototype(prototype);
    }
    public UserModel(String objectId,
                     String name,
                     String favouriteSport,
                     String favouriteMovie,
                     boolean hasMarried,
                     EducationLevel education,
                     int age,
                     int psychologicalAge,
                     Date birthDate,
                     PhoneModel phone,
                     PetModel pet,
                     List<HouseModel> houses,
                     Map<String, List<Map<String, Map<String, ClothesModel>>>> wardrobes) {
        this.objectId = objectId;
        this.name = name;
        this.favouriteSport = favouriteSport;
        this.favouriteMovie = favouriteMovie;
        this.hasMarried = hasMarried;
        this.education = education;
        this.age = age;
        this.psychologicalAge = psychologicalAge;
        this.birthDate = birthDate;
        this.phone = phone;
        this.pet = pet;
        this.houses = houses;
        this.wardrobes = wardrobes;
        UserModel.unidirectionalDataflow(this, this.objectId);
    }
    public Builder builder() {
        Builder builder = new Builder();
        builder.objectId = objectId;
        builder.name = name;
        builder.favouriteSport = favouriteSport;
        builder.favouriteMovie = favouriteMovie;
        builder.hasMarried = hasMarried;
        builder.education = education;
        builder.age = age;
        builder.psychologicalAge = psychologicalAge;
        builder.birthDate = birthDate;
        builder.phone = phone;
        builder.pet = pet;
        builder.houses = houses;
        builder.wardrobes = wardrobes;
        return builder;
    }
    public static void unidirectionalDataflow(UserModel model, String objectId) {
        // unidirectional data flow
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof UserModel)) return false;
        UserModel other = (UserModel) obj;
        return (objectId != null ? objectId.equals(other.objectId) : other.objectId == null)
               && (name != null ? name.equals(other.name) : other.name == null)
               && (favouriteSport != null ? favouriteSport.equals(other.favouriteSport) : other.favouriteSport == null)
               && (favouriteMovie != null ? favouriteMovie.equals(other.favouriteMovie) : other.favouriteMovie == null)
               && Boolean.compare(hasMarried, other.hasMarried) == 1
               && (education != null ? education.equals(other.education) : other.education == null)
               && Integer.compare(age, other.age) == 1
               && Integer.compare(psychologicalAge, other.psychologicalAge) == 1
               && (birthDate != null ? birthDate.equals(other.birthDate) : other.birthDate == null)
               && (phone != null ? phone.equals(other.phone) : other.phone == null)
               && (pet != null ? pet.equals(other.pet) : other.pet == null)
               && (houses != null ? houses.equals(other.houses) : other.houses == null)
               && (wardrobes != null ? wardrobes.equals(other.wardrobes) : other.wardrobes == null);
    }
    @Override
    public int hashCode() {
        int result = super.hashCode() != 0 ? super.hashCode() : 1;
        result = result * 37 + (objectId != null ? objectId.hashCode() : 0);
        result = result * 37 + (name != null ? name.hashCode() : 0);
        result = result * 37 + (favouriteSport != null ? favouriteSport.hashCode() : 0);
        result = result * 37 + (favouriteMovie != null ? favouriteMovie.hashCode() : 0);
        result = result * 37 + Boolean.valueOf(hasMarried).hashCode();
        result = result * 37 + (education != null ? education.hashCode() : 0);
        result = result * 37 + Integer.valueOf(age).hashCode();
        result = result * 37 + Integer.valueOf(psychologicalAge).hashCode();
        result = result * 37 + (birthDate != null ? birthDate.hashCode() : 0);
        result = result * 37 + (phone != null ? phone.hashCode() : 0);
        result = result * 37 + (pet != null ? pet.hashCode() : 0);
        result = result * 37 + (houses != null ? houses.hashCode() : 0);
        result = result * 37 + (wardrobes != null ? wardrobes.hashCode() : 0);
        return result;
    }
    public class Builder {
        public String objectId;
        public String name;
        public String favouriteSport;
        public String favouriteMovie;
        public boolean hasMarried;
        public EducationLevel education;
        public int age;
        public int psychologicalAge;
        public Date birthDate;
        public PhoneModel phone;
        public PetModel pet;
        public List<HouseModel> houses;
        public Map<String, List<Map<String, Map<String, ClothesModel>>>> wardrobes;
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder favouriteSport(String favouriteSport) {
            this.favouriteSport = favouriteSport;
            return this;
        }
        public Builder favouriteMovie(String favouriteMovie) {
            this.favouriteMovie = favouriteMovie;
            return this;
        }
        public Builder hasMarried(boolean hasMarried) {
            this.hasMarried = hasMarried;
            return this;
        }
        public Builder education(EducationLevel education) {
            this.education = education;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder psychologicalAge(int psychologicalAge) {
            this.psychologicalAge = psychologicalAge;
            return this;
        }
        public Builder birthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }
        public Builder phone(PhoneModel phone) {
            this.phone = phone;
            return this;
        }
        public Builder pet(PetModel pet) {
            this.pet = pet;
            return this;
        }
        public Builder houses(List<HouseModel> houses) {
            this.houses = houses;
            return this;
        }
        public Builder wardrobes(Map<String, List<Map<String, Map<String, ClothesModel>>>> wardrobes) {
            this.wardrobes = wardrobes;
            return this;
        }
        public UserModel build() {
            return new UserModel(objectId,
                                 name,
                                 favouriteSport,
                                 favouriteMovie,
                                 hasMarried,
                                 education,
                                 age,
                                 psychologicalAge,
                                 birthDate,
                                 phone,
                                 pet,
                                 houses,
                                 wardrobes);
        }
    }
}