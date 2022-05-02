package com.eltrend.yugi_ohdecks

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.eltrend.yugi_ohdecks.models.BlogPost
import kotlinx.android.synthetic.main.layout_blog_list_item.view.*

class BlogRecyclerAdapter :RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    companion object {
        var  clicked=0
    }
    private var items:List<BlogPost> =ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BlogViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_blog_list_item,parent,false)
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is BlogViewHolder->{
                holder.bind(items.get(position))


            }

        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun submitList(blogList: List<BlogPost>){
        items=blogList
    }

   class BlogViewHolder constructor(
       itemView: View

   ): RecyclerView.ViewHolder(itemView){
       init {

           itemView.setOnClickListener{
               when(position){
                   0->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=1
                   }
                   1->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=2
                   }
                   2->{
                       itemView.context.startActivity(Intent(itemView.context,fifth::class.java))
                       clicked=22

                   }
                   3->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=3
                   }
                   4->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=4
                   }
                   5->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=5
                   }
                   6->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=6
                   }
                   7->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=7
                   }
                   8->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=8
                   }
                   9->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=9
                   }
                   10->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=10
                   }
                   11->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=11
                   }
                   12->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=12
                   }
                   13->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=13
                   }
                   14->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=14
                   }
                   15->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=15
                   }
                   16->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=16
                   }
                   17->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=17
                   }
                   18->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=18
                   }
                   19->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=19
                   }
                   20->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=20
                   }
                   21->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=21
                   }
                   22->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=22
                   }
                   23->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=23
                   }
                   24->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=24
                   }
                   25->{

                       itemView.context.startActivity(Intent(itemView.context,forth::class.java))
                       clicked=25
                   }
                   26-> {

                   itemView.context.startActivity(Intent(itemView.context, forth::class.java))
                   clicked = 26
               }
                   27-> {

                       itemView.context.startActivity(Intent(itemView.context, forth::class.java))
                       clicked = 27
                   }
                   28-> {

                       itemView.context.startActivity(Intent(itemView.context, forth::class.java))
                       clicked = 28
                   }
                   29-> {

                       itemView.context.startActivity(Intent(itemView.context, forth::class.java))
                       clicked = 29
                   }
                   30-> {

                       itemView.context.startActivity(Intent(itemView.context, forth::class.java))
                       clicked = 29
                   }

               }
           }
       }

       val blogImage =itemView.blog_image
       val blogTitle =itemView.blog_title
       val blogAuther=itemView.blog_author
       fun  bind(blogPost: BlogPost){
           blogTitle.setText(blogPost.title)
           blogAuther.setText(blogPost.username)
           val  requestOptions= RequestOptions()
               .placeholder(R.drawable.ic_launcher_background)
               .error(R.drawable.ic_launcher_background)

           Glide.with(itemView.context)
               .applyDefaultRequestOptions(requestOptions)
               .load(blogPost.image)
               .into(blogImage)

       }
   }


}