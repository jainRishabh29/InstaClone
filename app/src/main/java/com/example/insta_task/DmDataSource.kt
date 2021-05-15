package com.example.insta_task

class DmDataSource {

    companion object{

        fun createDataSet(): ArrayList<DirectMessage>{
            val list = ArrayList<DirectMessage>()
            list.add(
                DirectMessage(
                    "beach1",
                    "https://cdn.mos.cms.futurecdn.net/wtqqnkYDYi2ifsWZVW2MT4-1200-80.jpg",
                    "Liked a message",
                )
            )
            list.add(
                DirectMessage(
                    "beach2",
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "Sent",
                )
            )

            list.add(
                DirectMessage(
                    "beach3",
                    "https://media.timeout.com/images/105488726/630/472/image.jpg",
                    "Active 2h ago",
                )
            )
            list.add(
                DirectMessage(
                    "beach4",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "New message",
                )
            )
            list.add(
                DirectMessage(
                    "beach5",
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "Mentioned you in story",
                )
            )
            list.add(
                DirectMessage(
                    "beach6",
                    "https://cdn.mos.cms.futurecdn.net/wtqqnkYDYi2ifsWZVW2MT4-1200-80.jpg",
                    "beaches",
                )
            )
            list.add(
                DirectMessage(
                    "beach7",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "sent",
                )
            )
            list.add(
                DirectMessage(
                    "beach8",
                    "https://img.traveltriangle.com/blog/wp-content/uploads/2019/06/Best-Beaches-Near-Davao-City.jpg",
                    "liked a message",

                )
            )
            list.add(
                DirectMessage(
                    "beach9",
                    "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                    "4 new messages",

                )
            )
            return list
        }
    }
}