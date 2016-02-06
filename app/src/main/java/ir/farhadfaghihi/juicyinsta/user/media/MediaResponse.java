package ir.farhadfaghihi.juicyinsta.user.media;

import java.util.ArrayList;

import ir.farhadfaghihi.juicyinsta.user.model.Meta;

/**
 * Created by Farhad on 2/6/2016.
 */
public class MediaResponse
{
    private Meta meta ;
    private ArrayList<Media> data ;

    public Meta getMeta()
    {
        return meta;
    }

    public void setMeta(Meta meta)
    {
        this.meta = meta;
    }

    public ArrayList<Media> getData()
    {
        return data;
    }

    public void setData(ArrayList<Media> data)
    {
        this.data = data;
    }
}
