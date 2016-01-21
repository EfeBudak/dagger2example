package com.pasha.efe.dagger2example.pojos;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by efe on 20/01/16.
 */
public class Repo implements Parcelable {

    public static final Parcelable.Creator<Repo> CREATOR = new Parcelable.Creator<Repo>() {
        public Repo createFromParcel(Parcel source) {
            return new Repo(source);
        }

        public Repo[] newArray(int size) {
            return new Repo[size];
        }
    };
    @SerializedName("id")
    int id;
    @SerializedName("name")
    String name;
    @SerializedName("full_name")
    String fullName;

    public Repo() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return fullName;
    }

    protected Repo(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.fullName = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.fullName);
    }
}
